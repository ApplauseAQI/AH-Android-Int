package com.example.helloworldapphanceintegration;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.apphance.android.Apphance;
import com.apphance.android.Log;

/***********************************/
/* Configure Logging with Apphance */

/**
 * *******************************
 */
// The next line will import Apphance's built-in logging methods. You should use
// these in place of Android's regular logging methods. Apphance's methods
// automatically send log messages to the Apphance servers where you can review log
// data along with crash reports and bug reports. In addition, Apphance's logging
// methods will still make your log entries available locally in Logcat.
// Learn more by visiting http://help.apphance.com/library-installation/android/logging

public class MainActivity extends Activity {

    /************************************/
    /* Application Key for for Apphance */

    /**
     * ****************************
     */
    // You must insert your Apphance application key in the next line of code:
    public static final String APP_KEY = "Your-Apphance-Application-Key-Goes-Here";

    // If you do not have an Apphance application key, you must first create a free account.
    // Visit http://www.apphance.com for more information about how to create your account.
    //
    // If you already have an Apphance account, login to the Apphance control panel at: https://panel.apphance.com
    // Create a new application (if you have not done so already).
    // Your application key can be retrieved at any time from the "Settings" tab on the left menu.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (APP_KEY.equals("Your-Apphance-Application-Key-Goes-Here")) {
            Toast.makeText(this, "You have not provided Apphance Application Key in MainActivity.APP_KEY", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        /********************************/
        /* Starting an Apphance session */
        /********************************/
        // The following line of code actually starts an Apphance session in QA mode.
        // Learn more by visiting http://help.apphance.com/library-installation/android/starting-session
        Apphance.startNewSession(this, APP_KEY, Apphance.Mode.QA);

        /*************************/
            /* Logging with Apphance */
        /*************************/
        // Apphance can replace the default logging mechanism with its own mechanism,
        // assuming you import com.apphance.android.Log. See above for more details.
        Log.w("myTag", "This log message will be sent to Apphance.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Apphance.onStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Apphance.onStop(this);
    }
}
