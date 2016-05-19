package com.yclim.simplecurrencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        //Initialization
        EditText dollarField = (EditText) findViewById(R.id.dollarField);
        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double poundAmount = dollarAmount * 4.09;

        String result = String.format(Locale.getDefault(), "%.2f", poundAmount); //Locale.getDefault() to get the device user's current setting

        Toast.makeText(this, "RM" + result, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
