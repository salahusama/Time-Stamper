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

        year = new Year(this, dayWidth, dayHeight);
    }

    float currX = 0;
    float last_mouseX;

    public void draw() {
        background(0);
        pushMatrix();
        translate(currX, 0);
        year.display();
        popMatrix();

        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);

            // horizontal scrolling
            last_mouseX = currX;
            if (last_mouseX > mouseX) {
                last_mouseX = currX;
                currX -= 10;
            }
            else if (last_mouseX < mouseX) {
                last_mouseX = currX;
                currX += 10;
            }
        }

    }
}
