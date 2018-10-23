package com.pprios.operacionmatematica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campo1, campo2;
    TextView etiResultado;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fill data
        campo1 = (EditText) findViewById(R.id.campo1);
        campo2 = (EditText) findViewById(R.id.campo2);
        etiResultado = (TextView) findViewById(R.id.etiResultado);
    }

    public void onClick(View view) {

        num1 = Integer.parseInt(campo1.getText().toString());
        num2 = Integer.parseInt(campo2.getText().toString());

        switch (view.getId()){
            case R.id.btnSuma: sumar();
                break;
            case R.id.btnResta: restar();
                break;
            case R.id.btnMultiplicacion: multiplicar();
                break;
            case R.id.btnDivicion: dividir();
                break;
        }
    }

    private void sumar(){
        etiResultado.setText( "El resultado de la suma es " + (num1 + num2) );
    }

    private void restar(){
        etiResultado.setText( "El resultado de la resta es " + (num1 - num2) );
    }

    private void multiplicar(){
        etiResultado.setText( "El resultado de la multiplicacion es " + (num1 * num2) );
    }

    private void dividir(){
        if (num2 > 0) {
            etiResultado.setText( "El resultado de la división es " + (num1 / num2) );
        } else {
            Toast.makeText(this,"Advertencia no puedes dividir / 0", Toast.LENGTH_LONG).show();
        }
    }
}
