package com.example.calculartorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MassConversionActivity extends AppCompatActivity {

    Spinner spinnerFrom,spinnerTo ;
    Button btn_convert;
   EditText input;
   TextView result;
    public static double convert(double value, String fromUnit, String toUnit) {
        // Convert the mass value to kilograms
        switch (fromUnit) {
            case "kg":
                break;
            case "g":
                value /= 1000;
                break;
            case "lb":
                value *= 0.453592;
                break;
            case "oz":
                value *= 0.0283495;
                break;
        }

        // Convert the mass value from kilograms to the desired unit
        switch (toUnit) {
            case "kg":
                break;
            case "g":
                value *= 1000;
                break;
            case "lb":
                value /= 0.453592;
                break;
            case "oz":
                value /= 0.0283495;
                break;
        }

        return value;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.modeScientific:
                Intent i1 = new Intent(this,scientificActivity.class);
                this.startActivity(i1);
                finish();
                return true;
            case R.id.modeStandard:
                Intent i2 = new Intent(this,MainActivity.class);
                this.startActivity(i2);
                finish();
                return true;
            case R.id.ConversionDevise:
                Intent i3 = new Intent(this,DeviseConversionActivity.class);
                this.startActivity(i3);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_conversion);
        spinnerFrom = (Spinner) findViewById(R.id.from_unit);
        spinnerTo = (Spinner)findViewById(R.id.to_unit);
        btn_convert = (Button)findViewById(R.id.convert);
        input =(EditText) findViewById(R.id.value);
        result =(TextView) findViewById(R.id.result);

        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double d = Double.parseDouble( input.getText().toString());
                    result.setText("Result: "+convert(d,spinnerFrom.getSelectedItem().toString(),spinnerTo.getSelectedItem().toString())+" "+spinnerTo.getSelectedItem().toString());
                }
                catch (Exception e){
                }
            }
        });

    }

}