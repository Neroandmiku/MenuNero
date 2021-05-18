package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Operaciones extends AppCompatActivity {
    Button btnSuma,btnResta,btnMultiplicacion,btnDividir,btnClear;
    EditText etNumero1, etNumero2, etRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        etNumero1=(EditText)findViewById(R.id.etNumero1);
        etNumero2=(EditText)findViewById(R.id.etNumero2);
        etRespuesta=(EditText)findViewById(R.id.etRespuesta);

        btnSuma=(Button)findViewById(R.id.btnSuma);
        btnResta=(Button)findViewById(R.id.btnResta);
        btnMultiplicacion=(Button)findViewById(R.id.btnMultiplicar);
        btnDividir=(Button)findViewById(R.id.btnDividir);
        btnClear=(Button) findViewById(R.id.btnClear);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1+numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1-numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1*numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1/numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumero1.setText("");
                etNumero2.setText("");
                etRespuesta.setText("");
            }
        });
    }
}