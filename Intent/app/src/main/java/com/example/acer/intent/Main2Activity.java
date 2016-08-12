package com.example.acer.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{

    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt2=(TextView) findViewById(R.id.textView2);
        Intent intname=getIntent();
        String uname=(String) intname.getSerializableExtra("username");
        txt2.setText("welcome      "+uname);




    }
}
