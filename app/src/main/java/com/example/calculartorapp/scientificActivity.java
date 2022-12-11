package com.example.calculartorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class scientificActivity extends AppCompatActivity {

    ImageView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0,btn_c;
    ImageView btn_dot, btn_equal, btn_ac, btn_module, btn_plus, btn_minus, btn_multiplication;
    ImageView btn_cos,btn_sin,btn_tan,btn_DivBy,btn_open,btn_close,btn_log,btn_pi,btn_powr,btn_racine;
    TextView inputTxt, OutputTxt;

    String data;

    public double evaluate(String expression) {
        Expression exp = new ExpressionBuilder(expression)
                .build();
        return exp.evaluate();
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
            case R.id.modeStandard:
                Intent i1 = new Intent(this, MainActivity.class);
                this.startActivity(i1);
                finish();
                return true;
            case R.id.ConversionMasse:
                Intent i2 = new Intent(this,MassConversionActivity.class);
                this.startActivity(i2);
                finish();
                return true;
            case R.id.ConversionDevise:
                Intent i3 = new Intent(this, DeviseConversionActivity.class);
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
        setContentView(R.layout.activity_scientific);


        OutputTxt = findViewById(R.id.outPuttxt);
        inputTxt = findViewById(R.id.inputTxt);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_c = findViewById(R.id.btn_c);
        //
        btn_cos = findViewById(R.id.btn_cos);
        btn_sin = findViewById(R.id.btn_sin);
        btn_tan = findViewById(R.id.btn_tan);
        btn_DivBy = findViewById(R.id.btn_divByx);
        btn_powr = findViewById(R.id.btn_powr);
        btn_pi = findViewById(R.id.btn_pi);
        btn_open = findViewById(R.id.btn_openP);
        btn_close = findViewById(R.id.btn_closeP);
        btn_racine = findViewById(R.id.btn_racine);
        btn_log = findViewById(R.id.btn_log);


        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equal);
        btn_ac = findViewById(R.id.btn_ac);
        btn_module = findViewById(R.id.btn_module);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiplication = findViewById(R.id.btn_multiplication);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inputTxt.getText().toString();
                if(s.length()>0)
                    inputTxt.setText(s.substring(0, s.length() - 1));
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "2");
            }
        });


        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "9");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText("");
                OutputTxt.setText("");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + ".");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "-");
            }
        });

        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "%");
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "×");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();

                data=data.replaceAll("×","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");
                int openCounter=0;
                for(int i=0;i<data.length();i++){
                    if(data.charAt(i)=='(') openCounter++;
                    else if(data.charAt(i) == ')') openCounter--;
                }
                for(int i=0;i<openCounter;i++){
                    data =data +")";
                }
                inputTxt.setText(data);
                try {
                    double finalResult = evaluate(data);

                    OutputTxt.setText(finalResult + "");
                }
                catch(Exception e){
                    OutputTxt.setText("Error");
                }
            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "sin(");
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "cos(");
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "tan(");
            }
        });
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "(");
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + ")");
            }
        });
        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + " pi ");
            }
        });
        btn_racine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "sqrt(");
            }
        });
        btn_powr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "^");
            }
        });
        btn_DivBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText("1 / ("+data+")");
            }
        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "log(");
            }
        });
    }


}