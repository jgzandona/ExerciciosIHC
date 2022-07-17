package com.example.exercicioraiva;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity implements SensorEventListener {

    TextView lightValue;
    TextView tempValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SensorManager sensorManager;
        Sensor light;
        Sensor temper;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lightValue = (TextView)findViewById(R.id.light);
        tempValue = (TextView)findViewById(R.id.temper);
        sensorManager = (SensorManager)
                getSystemService(Context.SENSOR_SERVICE);
        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        temper = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if(light != null)
        {
            sensorManager.registerListener(MainActivity.this, light,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }else
        {
            lightValue.setText("Light sensor not supported");
        }
        if(temper != null)
        {
            sensorManager.registerListener(MainActivity.this, temper,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }else
        {
            lightValue.setText("Light sensor not supported");
        }

    }
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
    public void onSensorChanged(SensorEvent event) {
        Sensor sensor = event.sensor;
        if(sensor.getType() == Sensor.TYPE_LIGHT)
        {
            lightValue.setText("Light Intensity: " + event.values[0]);
        }

        else if(sensor.getType() == Sensor.TYPE_GYROSCOPE)
        {
            tempValue.setText("Giroscope: " + event.values[0]);
        }
    }

}
