package com.example.ranjana.mytaskscheduler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ranjana on 7/18/2015.
 */
public class ViewTasks extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_tasks);
        displayAllTasks();
    }

    public void displayAllTasks() {
        ArrayList <String> taskArray = getIntent().getExtras().getStringArrayList("TaskValues");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.task_items, //Create this layout
                taskArray);

        ListView list = (ListView) findViewById(R.id.taskListView);
        list.setAdapter(adapter);
    }

    public void addNewTask(View view) {
        Intent addTask = new Intent(this, AddTask.class);
        addTask.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(addTask);
    }

    public void deleteAll(View view) {
        Intent deleteTasks = new Intent(this, TaskProfile.class);
        Toast.makeText(this, "All tasks deleted", Toast.LENGTH_SHORT).show();
        startActivity(deleteTasks);
    }

    public void showTaskProfile(View view) {
        Intent showProfile = new Intent(this, TaskProfile.class);
        showProfile.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(showProfile);
    }

}
