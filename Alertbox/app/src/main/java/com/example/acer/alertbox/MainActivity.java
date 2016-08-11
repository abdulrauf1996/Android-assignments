package com.example.acer.alertbox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        bt3=(Button) findViewById(R.id.button3);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("confirmation");
                alertDialog.setMessage("this is a single button dialog box");
                alertDialog.setIcon(R.drawable.images);
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "you pressed cancel button", Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog1 = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog1.setTitle("confirmation");
                alertDialog1.setMessage("this is a double button dialog box");
                alertDialog1.setIcon(R.drawable.prr);
                alertDialog1.setButton(DialogInterface.BUTTON_POSITIVE, "ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "You pressed ok button", Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog1.setButton(DialogInterface.BUTTON_NEGATIVE, "cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "you pressed cancel button", Toast.LENGTH_LONG).show();
                    }

                });
                alertDialog1.show();
            }

        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
              AlertDialog alt=new AlertDialog.Builder(MainActivity.this).create();
                alt.setTitle("confirmation");
                alt.setMessage("this is multiple dialog box");
                alt.setButton(DialogInterface.BUTTON_POSITIVE, "yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"you pressed yes button",Toast.LENGTH_LONG).show();
                    }
                });
                alt.setButton(DialogInterface.BUTTON_NEGATIVE, "no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        Toast.makeText(getApplicationContext(),"you pressed no button",Toast.LENGTH_LONG).show();
                    }
                });
                alt.setButton(DialogInterface.BUTTON_NEUTRAL, "cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"you pressed cancel button",Toast.LENGTH_LONG).show();
                    }
                });
                alt.show();
            }
        });


    }

}

