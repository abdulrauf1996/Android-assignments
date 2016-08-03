package com.example.acer.textviewswapping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    EditText ed1;
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button) findViewById(R.id.button);
        ed1=(EditText) findViewById(R.id.editText);
        tx1=(TextView) findViewById(R.id.textView);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s;
                s=ed1.getText().toString();
                tx1.setText(s);
            }
        });







    }
}
