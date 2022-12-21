package edu.pjatk.grzybber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GrzybberMenuActivity extends AppCompatActivity {

    private TextView message;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.grzybyCounter);
        ImageView droid = findViewById(R.id.grzyberImage);

        //Define and attach click listener
        droid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapDroid();
            }
        });
    }

    private void tapDroid() {
        counter++;
        String countAsText;
        /*
         * In real applications you should not write switch like the one below.
         * Use resource of type "Quantity strings (plurals)" instead.
         * See https://developer.android.com/guide/topics/resources/string-resource#Plurals
         */
        switch (counter) {
            default:
                countAsText = String.format("%d grzybuw", counter);
        }
        message.setText(String.format("Podniosłeś %s", countAsText));
    }

    public void changeActivity(View view) {
        Intent i = new Intent(this, AtlasGrzybowActivity.class);
        startActivity(i);
    }
}