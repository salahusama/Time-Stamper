package oop.project.timestamper;

import processing.core.PApplet;

/**
 * Created by salah on 25/04/17.
 */


public class Sketch extends PApplet {
    float dayWidth;
    float dayHeight;
    Year year;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        dayHeight = height;
        dayWidth = width / 5;

        year = new Year(this);
    }

    public void draw() {
        background(0);
        year.display();

        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
