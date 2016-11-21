package org.firstinspires.ftc.robotcontroller.internal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.qualcomm.ftcrobotcontroller.R;

/**
 * Created by Joseph Higham on 1/18/2016.
 */
public class FtcRobotControllerBuildTimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_time);

        TextView textView = (TextView) findViewById(R.id.text_build_time);
        textView.setText("Built 2016-01-18 21:56");
    }
}
