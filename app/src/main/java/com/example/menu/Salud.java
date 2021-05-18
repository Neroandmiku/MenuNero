package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class Salud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        EditText txtNombre,txtAltura,txtPeso,etICM,etNombreSalida,etGenero;
        Button btnCalcular,btnLimpiar;
        RadioButton rbMujer,rbHombre;

        txtNombre=(EditText)findViewById(R.id.txtNombre);
        txtAltura=(EditText)findViewById(R.id.txtAltura);
        txtPeso=(EditText)findViewById(R.id.txtPeso);
        etICM=(EditText)findViewById(R.id.etICM);
        etNombreSalida=(EditText)findViewById(R.id.etNombreSalida);
        etGenero=(EditText)findViewById(R.id.etGenero);

        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        btnLimpiar=(Button)findViewById(R.id.btnLimpiar);

        rbMujer=(RadioButton)findViewById(R.id.rbMujer);
        rbHombre=(RadioButton)findViewById(R.id.rbHombre);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                float altura=Float.parseFloat(txtAltura.getText().toString());
                float peso=Float.parseFloat(txtPeso.getText().toString());
                double altura2=altura/100;
                double respuesta=peso/(altura2*altura2);

                etICM.setText(respuesta+"");
                etNombreSalida.setText(nombre+"");

                rbMujer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        etGenero.setText("Hombre");
                    }
                });
                rbHombre.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        etGenero.setText("Mujer");
                    }
                });
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                txtAltura.setText("");
                txtPeso.setText("");
                etGenero.setText("");
                etICM.setText("");
                etNombreSalida.setText("");
            }
        });
    }
}
