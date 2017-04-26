package oop.project.timestamper;

import processing.core.PApplet;

/**
 * Created by salah on 26/04/17.
 */

public class Day {
    PApplet parent;

    float startX;
    float startY;
    float dayWidth;
    float dayHeight;
    float headHeight;
    int color;

    public Day(PApplet parent, float startX, float startY, float dayWidth, float dayHeight, int red, int green, int blue) {
        this.parent = parent;
        this.dayWidth = dayWidth;
        this.dayHeight = dayHeight;
        this.headHeight = 0.20f * dayHeight;
        this.color = parent.color(red, green, blue);
    }

    private void makeShape() {
        parent.noFill();
        parent.stroke(color);
        parent.strokeWeight(3);
        parent.rect(startX, startY, dayWidth, dayHeight);
    }

    public void display() {
        makeShape();
    }
}
