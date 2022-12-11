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

import java.util.HashMap;
import java.util.Map;

public class DeviseConversionActivity extends AppCompatActivity {

    Spinner spinnerFrom,spinnerTo ;
    Button btn_convert;
    EditText input;
    TextView result;
    private Map<String, Double> conversionRates = new HashMap<>();



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.modeStandard:
                Intent i1 = new Intent(this,MainActivity.class);
                this.startActivity(i1);
                finish();
                return true;
            case R.id.ConversionMasse:
                Intent i2 = new Intent(this,MassConversionActivity.class);
                this.startActivity(i2);
                finish();
                return true;
            case R.id.modeScientific:
                Intent i3 = new Intent(this,scientificActivity.class);
                this.startActivity(i3);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public double convert(String fromUnit,String toUnit, double value) {
        // Retrieve the conversion rate for the target currency
        switch (fromUnit) {
            case "USD":
                break;
            case "EUR":
                value *= conversionRates.get("EUR");
                break;
            case "GBP":
                value *= conversionRates.get("GBP");
                break;

        }

        // Convert the mass value from kilograms to the desired unit
        switch (toUnit) {
            case "USD":
                break;
            case "EUR":
                value /= conversionRates.get("EUR");
                break;
            case "GBP":
                value /= conversionRates.get("GBP");
                break;

        }

        // Return the converted amount
        return value;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devise_conversion);

        conversionRates.put("USD", 1.0);
        conversionRates.put("EUR", 0.86);
        conversionRates.put("GBP", 0.76);

        spinnerFrom = (Spinner) findViewById(R.id.from_unit);
        spinnerTo = (Spinner)findViewById(R.id.to_unit);
        btn_convert = (Button)findViewById(R.id.convert);
        input =(EditText) findViewById(R.id.value);
        result =(TextView) findViewById(R.id.result);

        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    double d = Double.parseDouble( input.getText().toString());
                    result.setText("Result: "+convert(spinnerFrom.getSelectedItem().toString(),spinnerTo.getSelectedItem().toString(),d)+" " +spinnerTo.getSelectedItem().toString());

                }catch (Exception e ) {


                }





            }
        });


    }
}