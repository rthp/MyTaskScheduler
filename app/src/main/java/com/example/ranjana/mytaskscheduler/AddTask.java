package com.example.ranjana.mytaskscheduler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ranjana on 7/17/2015.
 */
public class AddTask extends Activity {

    private EditText taskName;
    private EditText taskDetail;
    private ArrayList<String> myTaskList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_task_add);
        taskName = (EditText) findViewById(R.id.taskName);
        taskDetail =  (EditText) findViewById(R.id.taskDetail);
    }

    public void submitTaskInformation(View view) {
        String name = taskName.getText().toString();
        String body = taskDetail.getText().toString();

        myTaskList.add(name);
        myTaskList.add(body);
        Toast.makeText(this, "Task is added", Toast.LENGTH_SHORT).show();
        Intent showTask = new Intent(this, ViewTasks.class);
        showTask.putStringArrayListExtra("TaskValues",myTaskList);
        startActivity(showTask);

    }
}
