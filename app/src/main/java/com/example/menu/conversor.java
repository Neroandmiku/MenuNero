package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class conversor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        EditText txtEntrada,txtConversion;
        Button btnDolares,btnKM,btnKelvin,btnSoles,btnMetros,btnCentigrados,btnClear1;

        txtEntrada=(EditText)findViewById(R.id.txtEntrada);
        txtConversion=(EditText)findViewById(R.id.txtConversion);

        btnDolares=(Button)findViewById(R.id.btnDolares);
        btnKM=(Button)findViewById(R.id.btnKM);
        btnKelvin=(Button)findViewById(R.id.btnKelvin);
        btnSoles=(Button)findViewById(R.id.btnSoles);
        btnMetros=(Button)findViewById(R.id.btnMetros);
        btnCentigrados=(Button)findViewById(R.id.btnCentigrados);
        btnClear1=(Button)findViewById(R.id.btnClear1);


        btnDolares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entrada1=Integer.parseInt(txtEntrada.getText().toString());
                double entrada2=entrada1/3.64;

                txtConversion.setText(entrada2+" dolares");
            }
        });

        btnKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entrada1=Integer.parseInt(txtEntrada.getText().toString());
                double entrada2=entrada1/1000;

                txtConversion.setText(entrada2+" Km");
            }
        });
        btnKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entrada1=Integer.parseInt(txtEntrada.getText().toString());
                double entrada2=entrada1+273.15;

                txtConversion.setText(entrada2+"°K");
            }
        });
        btnSoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entrada1=Integer.parseInt(txtEntrada.getText().toString());
                double entrada2=entrada1*3.64;

                txtConversion.setText(entrada2+" soles");
            }
        });
        btnMetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entrada1=Integer.parseInt(txtEntrada.getText().toString());
                double entrada2=entrada1*1000;

                txtConversion.setText(entrada2+" m");
            }
        });
        btnCentigrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entrada1=Integer.parseInt(txtEntrada.getText().toString());
                double entrada2=entrada1-273.15;

                txtConversion.setText(entrada2+"°C");
            }
        });
        btnClear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEntrada.setText("");
                txtConversion.setText("");
            }
        });
    }
}