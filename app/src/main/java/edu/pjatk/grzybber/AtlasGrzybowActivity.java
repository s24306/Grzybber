package edu.pjatk.grzybber;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AtlasGrzybowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atlas_grzybow);
    }

    public void goBack(View v){
        Intent i = new Intent(this, GrzybberMenuActivity.class);
        startActivity(i);
    }
}