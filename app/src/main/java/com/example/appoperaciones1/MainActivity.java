package com.example.appoperaciones1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSuma, btnResta, btnXcion, btnDivi, btnLimpiar;
    EditText txtNum1, txtNum2;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1= (EditText)findViewById(R.id.nro1);
        txtNum2= (EditText)findViewById(R.id.nro2);
        btnSuma= (Button) findViewById(R.id.suma);
        btnResta= (Button)findViewById(R.id.resta);
        btnXcion= (Button)findViewById(R.id.xcion);
        btnDivi= (Button)findViewById(R.id.divi);
        btnLimpiar= (Button)findViewById(R.id.clear);
        txtResultado=(TextView) findViewById(R.id.answer);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 + numero2;
                txtResultado.setText("El resultado es: "+ resultado);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 - numero2;
                txtResultado.setText("El resultado es: "+ resultado);
            }
        });

        btnXcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 * numero2;
                txtResultado.setText("El resultado es: "+ resultado);
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado;
                if (numero2!=0){
                     resultado = numero1 / numero2;
                     txtResultado.setText("El resultado es: "+ resultado);
                } else {
                    txtResultado.setText("El resultado es: INVALIDO NO SE PUEDE DIVIDIR ENTRE 0");
                }

            }
        });

    }
}