package com.example.sebas.newtest_helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText etOperand1, etOperand2, etErgebnis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etOperand1 = (EditText) findViewById(R.id.etOperand1);
        etOperand2 = (EditText) findViewById(R.id.etOperand2);
        etErgebnis= (EditText) findViewById(R.id.etErgebnis);
    }

    public void onClick(View view)
    {
        double o1,o2,r;
        o1 = Double.parseDouble(etOperand1.getText().toString());
        o2 = Double.parseDouble(etOperand2.getText().toString());
        switch(view.getId())
        {
            case R.id.btPlus:
                r=o1+o2;
                break;
            case R.id.btMinus:
                r=o1-o2;
                break;
            case R.id.btMultiplizieren:
                r=o1*o2;
                break;
            case R.id.btDividieren:
                r=o1/o2;
                break;

            default:
                r=0;
                break;
        }
        etErgebnis.setText(""+r);
    }
}
