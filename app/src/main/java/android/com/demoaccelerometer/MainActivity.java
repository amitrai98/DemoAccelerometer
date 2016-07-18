package android.com.demoaccelerometer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements StepListener{

    private final String TAG = getClass().getSimpleName();

    private TextView txtCount = null;
    int stepconunt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = (TextView) findViewById(R.id.txtCount);
        new StepDetector(this, this);

    }

    @Override
    public void onStep() {
        stepconunt += stepconunt;
        txtCount.setText(" Step "+stepconunt);

    }

    @Override
    public void passValue() {
        Log.e(TAG, "pass value");
    }
}
