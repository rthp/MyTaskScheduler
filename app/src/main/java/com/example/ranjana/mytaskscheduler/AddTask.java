package com.example.ranjana.mytaskscheduler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Ranjana on 7/17/2015.
 */
public class AddTask extends Activity {

    private EditText taskName;
    private EditText taskDetail;
    private Button   btntaskSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_task_add);
    }

    public void submitTaskInformation(View view) {
        taskName = (EditText) findViewById(R.id.taskName);
        taskDetail =  (EditText) findViewById(R.id.taskDetail);
        btntaskSubmit = (Button) findViewById(R.id.taskSubmit);
        Toast.makeText(this, "Task is added", Toast.LENGTH_SHORT).show();
        Intent showProfile = new Intent(this, TaskProfile.class);
        startActivity(showProfile);

    }
}
