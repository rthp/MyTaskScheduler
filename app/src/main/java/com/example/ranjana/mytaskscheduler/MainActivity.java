package com.example.ranjana.mytaskscheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    public static final String ABOUT_APP = "Task Scheduler helps to add your tasks and sends reminder of them";
    private Button btnStart;
    private Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnAbout = (Button) findViewById(R.id.btnAbout);

    }

    public void showAbout(View view) {
        Toast.makeText(this, ABOUT_APP, Toast.LENGTH_SHORT).show();
    }

    public void showTaskProfile(View view) {
        Intent showProfile = new Intent(this, TaskProfile.class);
        startActivity(showProfile);
    }
}
