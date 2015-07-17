package com.example.ranjana.mytaskscheduler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ranjana on 7/17/2015.
 */
public class TaskProfile extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_profile);

    }



    public void addNewTask(View view) {
        Intent addTask = new Intent(this, AddTask.class);
        startActivity(addTask);
    }
}
