package oop.project.timestamper;

/**
 * Created by salah on 25/04/17.
 */

import android.app.Fragment;
import processing.core.PApplet;

public class Sketch extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
