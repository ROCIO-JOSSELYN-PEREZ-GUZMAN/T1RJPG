package com.mx.edu.isc.t1rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class frmActivity2 extends AppCompatActivity implements View.OnClickListener {
EditText val1;
EditText val2;
TextView tem;
TextView resu;
Button calcu;
double resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        tem=findViewById(R.id.textView6);
        val1=findViewById(R.id.editText);
        val2=findViewById(R.id.editText2);
        resu=findViewById(R.id.textView10);
        Bundle ba=getIntent().getExtras();
        calcu=findViewById(R.id.button);
        calcu.setOnClickListener(this);
        switch (ba.getInt("opc")) {
            case 1:
                tem.setText("Suma");
                break;
            case 2:
                tem.setText("Resta");
                break;
            case 3:
                tem.setText("Multiplicacion");
                break;
            case 4:
                tem.setText("Divicion");
                break;
        }
    }

    @Override
    public void onClick(View view) {
        Bundle ba = getIntent().getExtras();
        switch (ba.getInt("opc")) {
            case 1:
                resul = (Integer.parseInt(val1.getText().toString())) + (Integer.parseInt(val2.getText().toString()));
                resu.setText("" + resul);
                break;
            case 2:
                resul = (Integer.parseInt(val1.getText().toString())) - (Integer.parseInt(val2.getText().toString()));
                resu.setText("" + resul);
                break;
            case 3:
                resul = (Integer.parseInt(val1.getText().toString())) * (Integer.parseInt(val2.getText().toString()));
                resu.setText("" + resul);
                break;
            case 4:
                resul = (Integer.parseInt(val1.getText().toString())) / (Integer.parseInt(val2.getText().toString()));
                resu.setText("" + resul);
                break;
        }
    }
        public void inic(View View) {
            Intent inicio =new Intent(this,frmActivity3.class);
            startActivity(inicio);
            finish();

        }

    }

