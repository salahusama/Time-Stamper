package oop.project.timestamper;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;

import processing.core.PApplet;

/**
 * Created by salah on 26/04/17.
 */

public class Year {
    PApplet parent;

    ArrayList<Day> days;
    float dayWidth;
    float dayHeight;

    public Year(PApplet parent, float dayWidth, float dayHeight) {
        this.parent = parent;
        this.dayHeight = dayHeight;
        this.dayWidth = dayWidth;

        days = new ArrayList<Day>();
        addDays();
    }

    private void addDays() {
        String[] months = {
                "January", "February", "March", "April"
                , "May", "June", "July", "August"
                , "September", "October", "November", "December" };

        int[] monthLen = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        float startX = 0;
        float startY = 0;
        float gap = dayWidth * 0.10f;

        int red = 255;
        int green = 255;
        int blue = 255;

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= monthLen[i]; j++) {
                // a day with month and date set
                Day day = new Day(parent, months[i], j, startX, startY, dayWidth, dayHeight, red, green, blue);
                day.addTask("Die");
                days.add(day);
                startX += gap + dayWidth;
            }
        }
    }

    public void display() {
        for (Day day: days) {
            day.display();
        }
    }
}
