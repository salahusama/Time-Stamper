package oop.project.timestamper;

import processing.core.PApplet;

/**
 * Created by salah on 25/04/17.
 */


public class Sketch extends PApplet {
    public void settings() {
        fullScreen();
    }

    Day day;

    public void setup() {
        day = new Day(this, 0, 0, width/5, height, 255, 255, 255);
    }

    public void draw() {
        background(0);
        day.display();

        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
