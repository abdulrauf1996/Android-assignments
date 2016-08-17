package com.example.acer.tablayout;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost=getTabHost();
        TabHost.TabSpec vediospec=tabhost.newTabSpec("vedios");
        vediospec.setIndicator("Vedios",getResources().getDrawable(R.drawable.iconvedio));
        Intent vediointent=new Intent(this,Vedioactivity.class);
        vediospec.setContent(vediointent);

        TabHost.TabSpec songspec=tabhost.newTabSpec("Songs");
        songspec.setIndicator("Songs",getResources().getDrawable(R.drawable.iconmusic));
        Intent songintent=new Intent(this,SongsActivity.class);
        songspec.setContent(songintent);

        TabHost.TabSpec imagespec=tabhost.newTabSpec("Images");
        imagespec.setIndicator("Images",getResources().getDrawable(R.drawable.iconimage));
        Intent imageintent=new Intent(this,PhotosActivity.class);
        imagespec.setContent(imageintent);

        tabhost.addTab(vediospec);
        tabhost.addTab(songspec);
        tabhost.addTab(imagespec);



    }
}
