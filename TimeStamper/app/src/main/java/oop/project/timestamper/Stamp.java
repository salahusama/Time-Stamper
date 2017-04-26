package oop.project.timestamper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Stamp extends AppCompatActivity {
    public static final String EXTRA_TITLE = "oop.project.timestamper.STAMP_TITLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stamp);
    }

    // when add_stamp pressed
    public void addStamp(View view) {
        Intent intent = new Intent(this, Calendar.class);
        EditText stampTitle = (EditText) findViewById(R.id.stampTitle);
        String title = stampTitle.getText().toString();
        intent.putExtra(EXTRA_TITLE, title);

        // this should instead save the title to a file...
        // find a way to do it -_-
    }
}
