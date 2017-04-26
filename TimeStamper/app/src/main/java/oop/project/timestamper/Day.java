package oop.project.timestamper;

import java.util.ArrayList;
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
    ArrayList<String> tasks;

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

        this.tasks = new ArrayList<String>();
    }

    public Day(PApplet parent, String month, int date, float startX, float startY, float dayWidth, float dayHeight, int red, int green, int blue) {
        this.parent = parent;
        this.date = new Date(month, date);
        this.startX = startX;
        this.startY = startY;
        this.dayWidth = dayWidth;
        this.dayHeight = dayHeight;
        this.headHeight = 0.2f * dayHeight;
        this.color = parent.color(red, green, blue);

        this.tasks = new ArrayList<String>();
    }

    public void display() {
        parent.noFill();
        parent.stroke(color);
        parent.strokeWeight(10);

        parent.pushMatrix();
        parent.translate(startX, startY);
        parent.rect(0, 0, dayWidth, dayHeight);

        parent.fill(0);
        parent.textSize(40);
        parent.textAlign(parent.CENTER, parent.CENTER);
        parent.text(date.date + " " + date.month + "" + "2017", dayWidth/2, headHeight/2);

        parent.fill(color);
        parent.rect(0, 0, dayWidth, headHeight);
        parent.popMatrix();

        float taskY = 0;

        for (String task: tasks) {
            parent.fill(255);
            parent.textSize(40);
            parent.textAlign(parent.LEFT, parent.CENTER);
            parent.text("> " + task, 50, headHeight + 50 + taskY);
            taskY += 50;
        }
    }

    public void addTask(String taskTitle) {
        tasks.add(taskTitle);
    }
}
