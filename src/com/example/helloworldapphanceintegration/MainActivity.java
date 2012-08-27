package com.example.helloworldapphanceintegration;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

import com.apphance.android.Apphance;

public class MainActivity extends Activity {
	
	public static final String APP_KEY = "6dca8d31314ce8e20ab6df20d6a786cd5147816d";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Apphance.startNewSession(this, APP_KEY, Apphance.Mode.QA);
        
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
