package com.pratamawijaya.androidbeginnercourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

// Actvity
// ActionBarActivity -> secara deafult sudah memiliki actionbar
// 22.2 -> AppCompatActivity

public class MainActivity extends AppCompatActivity {

    // method itu adalah fungsi
    // fungsi ada yang mengembalikan nilai dan ada yang TIDAK mengembalikan nilai

    // class  object
    Button btn1;

    @Bind(R.id.inputPhoneNumber)
    EditText inputPhoneNumber;

    @Bind(R.id.textPhone)
    TextView resultPhone;

    @Bind(R.id.btnCall)
    Button btnCall;

//    EditText inputPhoneNumber, inputName, inputAge, inputAddress;
//    TextView resultPhone;
//    Button btnCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // layout yang dihandle oleh activity
        setContentView(R.layout.activity_main);

        // langkah 1
        ButterKnife.bind(this);

        // intialize
        // agar bisa digunakan view harus di TypeCasting sesuai dengan objectnya

        // event listener
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // percabangan
                if (TextUtils.isEmpty(inputPhoneNumber.getText().toString())) {
                    // jika field phonenumberkosong maka
                    Toast.makeText(MainActivity.this, "phone number field required", Toast.LENGTH_SHORT).show();

                } else if (inputPhoneNumber.getText().toString().equals("147")) {

                    Toast.makeText(MainActivity.this, "laporan speedy rusak", Toast.LENGTH_SHORT).show();

                } else {
                    // jika field phonenumber TIDAK kosong maka

                    // untuk mengambil phone number yang berada di edittext
                    // String phoneNumber = inputPhoneNumber.getText().toString();

                    // set phone number to textView
                    resultPhone.setText(inputPhoneNumber.getText().toString());

                    // create bundle
                    Bundle data = new Bundle();
                    data.putString("phone", inputPhoneNumber.getText().toString());

                    // change activity
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtras(data);

                    // startactivity
                    startActivity(intent);
                }


                // finish
            }
        });


    }


    @OnClick(R.id.btnConvert)
    public void onConvert() {
        startActivity(new Intent(this, ThermalConverterActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
