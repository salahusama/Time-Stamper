package oop.project.timestamper;

import processing.core.PApplet;

/**
 * Created by salah on 26/04/17.
 */

public class Day {
    public class Date {
        String month;
        int date;

        public Date(String month, int date) {
            this.month = month;
            this.date = date;
        }
    }

    PApplet parent;

    Date date;
    float startX;
    float startY;
    float dayWidth;
    float dayHeight;
    float headHeight;
    int color;

    public Day(PApplet parent, String month, int date, float startX, float startY, float dayWidth, float dayHeight) {
        this.parent = parent;
        this.date = new Date(month, date);
        this.startX = startX;
        this.startY = startY;
        this.dayWidth = dayWidth;
        this.dayHeight = dayHeight;
    }

    public Day(PApplet parent, float startX, float startY, int red, int green, int blue) {
        this.parent = parent;
        //this.dayWidth = dayWidth;
        //this.dayHeight = dayHeight;
        this.headHeight = 0.20f * dayHeight;
        this.color = parent.color(red, green, blue);
    }

    public void display() {
        parent.noFill();
        parent.stroke(color);
        parent.strokeWeight(10);
        parent.rect(startX, startY, dayWidth, dayHeight);
    }
}
