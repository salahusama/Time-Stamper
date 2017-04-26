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
        this.headHeight = 0.2f * dayHeight;
    }

    public void display() {
        parent.noFill();
        parent.stroke(255);
        parent.strokeWeight(10);

        parent.pushMatrix();
        parent.translate(startX, startY);
        parent.rect(0, 0, dayWidth, dayHeight);

        parent.fill(255);
        parent.textSize(40);
        parent.textAlign(parent.CENTER, parent.CENTER);
        parent.text(date.date + " " + date.month + "" + "2017", dayWidth/2, headHeight/2);

        parent.line(0, headHeight, dayWidth, headHeight);
        parent.popMatrix();
    }
}
