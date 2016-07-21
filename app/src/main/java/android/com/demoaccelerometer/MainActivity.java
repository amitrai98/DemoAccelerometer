package android.com.demoaccelerometer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements StepListener{

    private final String TAG = getClass().getSimpleName();

    private TextView txtCount = null;
    int stepconunt = 0;
    StepDetector step = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = (TextView) findViewById(R.id.txtCount);
        step = new StepDetector(this, this);

    }

    @Override
    public void onStep() {
        stepconunt = stepconunt+1;
        txtCount.setText(" Step "+stepconunt);

    }

    @Override
    public void passValue() {
        Log.e(TAG, "pass value");
    }


    @Override
    protected void onPause() {
        super.onPause();
        step.onPause();
    }


    public void stopFootStep(View view){
        if(step != null)
            step.onPause();
    }

    public void startFootStep(View view){
        if(step != null)
            step.onResume();
    }
}
