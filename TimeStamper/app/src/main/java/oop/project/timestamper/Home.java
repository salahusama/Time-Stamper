package oop.project.timestamper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    // called when view_button pressed
    public void viewCalendar(View view) {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    // called when stamp_button pressed
    public void stamp(View view) {
        Intent intent = new Intent(this, Stamp.class);
        startActivity(intent);
    }
}
