package com.example.acer.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText ed1;
    Button bt1;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.editText);
        bt1=(Button) findViewById(R.id.button);
        bt1.setOnClickListener(new ButtonClickHandler());


    }
    public class ButtonClickHandler implements View.OnClickListener
{
    public void onClick(View view)
    {
        if (ed1!=null&& ed1.getText().length() !=0)
        {
            name=ed1.getText().toString();
        }
        else
        {
            name="yoyoyo";
        }
        Intent intobj=new Intent(MainActivity.this,Main2Activity.class);
        intobj.putExtra("username",name);
        startActivity(intobj);
    }
}
}
