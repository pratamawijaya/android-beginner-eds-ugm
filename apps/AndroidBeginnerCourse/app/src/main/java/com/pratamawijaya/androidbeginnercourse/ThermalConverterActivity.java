package com.pratamawijaya.androidbeginnercourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThermalConverterActivity extends AppCompatActivity {

    @Bind(R.id.inputCelcius)
    EditText inputCelc;
    @Bind(R.id.tempF)
    RadioButton tempF;
    @Bind(R.id.tempK)
    RadioButton tempK;
    @Bind(R.id.tempR)
    RadioButton tempR;
    @Bind(R.id.btnConver)
    Button btnConvert;
    @Bind(R.id.textResult)
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermal_converter);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConver)
    public void onBtnConvertClick() {
        float celcius = Float.parseFloat(inputCelc.getText().toString());
        float result = 0;
        if (tempF.isChecked()) {

            result = (float) ((celcius * 9 / 5.0) + 32);

            txtResult.setText("" + result);

            Toast.makeText(ThermalConverterActivity.this, "F", Toast.LENGTH_SHORT).show();
        } else if (tempR.isChecked()) {
            // logic for Celcius to Reamur

            result = (float) (celcius * 0.8);

            txtResult.setText(""+result);
        } else if (tempK.isChecked()) {
            // logic for Celcius to Kelvin
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_thermal_converter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
