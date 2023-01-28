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

    public void changeKurkaActivity(View view) {
        Intent i = new Intent(this, KurkaActivity.class);
        startActivity(i);
    }

    public void changeBorowikActivity(View view) {
        Intent i = new Intent(this, BorowikActivity.class);
        startActivity(i);
    }

    public void changeMuchomorActivity(View view) {
        Intent i = new Intent(this, MuchomorActivity.class);
        startActivity(i);
    }

    public void changePieczarkaActivity(View view) {
        Intent i = new Intent(this, PieczarkaActivity.class);
        startActivity(i);
    }
}