package com.aydemirabia.javaandroidsimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Kalıtım/Miras-Interihance kullanarak diğer oluşturduğumuz 4 işlem metotlarında da
    //kullanabiliriz.

    EditText Number1editText;
    EditText Number2editText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1editText = findViewById(R.id.editTextNumber1);
        Number2editText = findViewById(R.id.editTextNumber2);
        resultTextView = findViewById(R.id.textViewResult);
    }

    //public void Name(View view) bir görünüm tarafından çağrıldığını belirtmek için yazarız.

    public void Sum(View view){
        if(Number1editText.getText().toString().matches("") || Number2editText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number!");
        }
        else {
            //getText() : Kullanıcı tarafından girilen değeri alır.
            int number1 = Integer.parseInt(Number1editText.getText().toString());
            int number2 = Integer.parseInt(Number2editText.getText().toString());

            //setText() : Kullanıcı tarafından girilen değerin sonucunu yazdırır.
            int result = number1 + number2;
            resultTextView.setText("Result: " + result);
        }
    }

    public void Deduct(View view){
        if(Number1editText.getText().toString().matches("") || Number2editText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number!");
        }
        else {
            //getText() : Kullanıcı tarafından girilen değeri alır.
            int number1 = Integer.parseInt(Number1editText.getText().toString());
            int number2 = Integer.parseInt(Number2editText.getText().toString());

            //setText() : Kullanıcı tarafından girilen değerin sonucunu yazdırır.
            int result = number1 - number2;
            resultTextView.setText("Result: " + result);
        }
    }

    public void Multiply(View view){
        if(Number1editText.getText().toString().matches("") || Number2editText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number!");
        }
        else {
            //getText() : Kullanıcı tarafından girilen değeri alır.
            int number1 = Integer.parseInt(Number1editText.getText().toString());
            int number2 = Integer.parseInt(Number2editText.getText().toString());

            //setText() : Kullanıcı tarafından girilen değerin sonucunu yazdırır.
            int result = number1 * number2;
            resultTextView.setText("Result: " + result);
        }
    }

    public void Divide(View view){
        if(Number1editText.getText().toString().matches("") || Number2editText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number!");
        }
        else {
            //getText() : Kullanıcı tarafından girilen değeri alır.
            int number1 = Integer.parseInt(Number1editText.getText().toString());
            int number2 = Integer.parseInt(Number2editText.getText().toString());

            //setText() : Kullanıcı tarafından girilen değerin sonucunu yazdırır.
            int result = number1 / number2;
            resultTextView.setText("Result: " + result);
        }
    }
}
