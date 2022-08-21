package com.mec_dev.basitcalculator_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textViewResult;
    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }


    public void topla(View view){
        if(editText1.getText().toString().matches("") || editText1.toString().matches("")){

            textViewResult.setText("Please Enter A Number");
        }
        else{
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());
            int result = number1 + number2;
            textViewResult.setText("Result: " + result);
        }




    }
    public void cikar(View view){
        if(editText1.getText().toString().matches("") || editText1.toString().matches("")){

            textViewResult.setText("Please Enter A Number");
        }
        else{
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());
        int result = number1 - number2;
        textViewResult.setText("Result: " + result);}


    }

    public void bol(View view){
        if(editText1.getText().toString().matches("") || editText1.toString().matches("")){

            textViewResult.setText("Please Enter A Number");
        }
        else if (Integer.parseInt(editText2.getText().toString()) == 0){
            textViewResult.setText("Zero cannot be entered");
        }

        else{
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());
        int result = number1 / number2;
        textViewResult.setText("Result: " + result);}

    }

    public void carp(View view){
        if(editText1.getText().toString().matches("") || editText1.toString().matches("")){

            textViewResult.setText("Please Enter A Number");
        }
        else{
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());
        int result = number1 * number2;
        textViewResult.setText("Result: " + result);}

    }


}