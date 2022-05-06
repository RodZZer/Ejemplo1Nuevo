package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.txt_n1);
        et2=(EditText)findViewById(R.id.txt_n2);
        tv1=(TextView)findViewById(R.id.tv_r1);
    }
    public void Sumar(View view){
        String valor1_String = et1.getText().toString();
        int valor1_int = Integer.parseInt(valor1_String);

        String valor2_String = et2.getText().toString();
        int valor2_int = Integer.parseInt(valor2_String);

        int resul = valor1_int+valor2_int;

        tv1.setText(String.valueOf(resul));
    }
    public void Restar(View view){
        String valor1_String = et1.getText().toString();
        int valor1_int = Integer.parseInt(valor1_String);

        String valor2_String = et2.getText().toString();
        int valor2_int = Integer.parseInt(valor2_String);

        int resul = valor1_int-valor2_int;

        tv1.setText(String.valueOf(resul));
    }
    public void Multiplicar(View view){
        String valor1_String = et1.getText().toString();
        int valor1_int = Integer.parseInt(valor1_String);

        String valor2_String = et2.getText().toString();
        int valor2_int = Integer.parseInt(valor2_String);

        int resul = valor1_int*valor2_int;

        tv1.setText(String.valueOf(resul));
    }
    public void Dividir(View view){
        String valor1_String = et1.getText().toString();
        int valor1_int = Integer.parseInt(valor1_String);

        String valor2_String = et2.getText().toString();
        int valor2_int = Integer.parseInt(valor2_String);

        int resul = valor1_int/valor2_int;

        tv1.setText(String.valueOf(resul));
    }
}