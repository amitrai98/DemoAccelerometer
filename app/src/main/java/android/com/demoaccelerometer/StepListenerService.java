package android.com.demoaccelerometer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

/**
 * Created by amitrai on 18/7/16.
 */
public class StepListenerService extends Service {

    private String TAG = getClass().getSimpleName();
    private SensorManager mSensorManager = null;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {


        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);



        Log.e(TAG, ""+deviceSensors);

        return null;
    }
}
