package com.example.helloworldapphanceintegration;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.apphance.android.Apphance;
import com.apphance.android.Log;
import com.apphance.android.common.Configuration;
import com.apphance.android.common.IBuilder;

/***********************************/
/* Configure Logging with Apphance */

/**
 * *******************************
 */
// The next line will import Apphance's built-in logging methods. You should use
// these in place of Android's regular logging methods. Apphance's methods
// automatically send log messages to the Apphance servers where you can review
// log data along with crash reports and bug reports. In addition, Apphance's
// logging methods will still make your log entries available locally in Logcat.
// Learn more by visiting
// http://help.apphance.com/library-installation/android/logging

public class MainActivity extends Activity {

    /************************************/
    /* Application Key for for Apphance */

    /**
     * ****************************
     */
    // You must insert your Apphance application key in the next line of code:
    public static final String APP_KEY = "3e3898a09a7c0c96e0acfd966876dc6a000c39e7";// "Your-Apphance-Application-Key-Goes-Here";

    // If you do not have an Apphance application key, you must first create a
    // free account. Visit http://www.apphance.com for more information about
    // how to create your account.
    //
    // If you already have an Apphance account, login to the Apphance control
    // panel at: https://panel.apphance.com
    // Create a new application (if you have not done so already). Your
    // application key can be retrieved at any time from the "Settings" tab
    // on the left menu.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (APP_KEY.equals("Your-Apphance-Application-Key-Goes-Here")) {
            Toast.makeText(this, "You have not provided Apphance Application Key in MainActivity.APP_KEY",
                    Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        /********************************/
        /* Creating session configuration */
        /********************************/
        // Here create a configuration Apphance will use to start a session.
        // Configuration object uses builder pattern, so you can chain calls and
        // make the process of creation more compact.
        IBuilder builder = new Configuration.Builder(this);
        builder = builder.withServerURL("http://panel.apphance.com"); // specify
                                                                      // server,
                                                                      // skip
                                                                      // for
                                                                      // default
                                                                      // ("http://panel.apphance.com")
        builder = builder.withAPIKey(APP_KEY); // specify app key
        builder = builder.withReportOnShakeEnabled(true); // report on shake
                                                          // feature is on by
                                                          // default
        builder = builder.withUTestEnabled(false); // you can turn features used
                                                   // by utest emplyoees on,
                                                   // it's off by default
        builder = builder.withDefaultUser("anonymous@apphance.com"); // specify
                                                                     // user to
                                                                     // log in
                                                                     // as, skip
                                                                     // for
                                                                     // manual
                                                                     // selection

        Configuration configuration = builder.build();

        /********************************/
        /* Starting an Apphance session */
        /********************************/
        // The following line of code actually starts an Apphance session in QA
        // mode. Learn more by visiting
        // http://help.apphance.com/library-installation/android/starting-session
        Apphance.startNewSession(this, configuration);

        /*************************/
        /* Logging with Apphance */
        /*************************/
        // Apphance can replace the default logging mechanism with its own
        // mechanism, assuming you import com.apphance.android.Log. See above
        // for more details.
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
