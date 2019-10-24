package com.mx.edu.isc.t1rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class frmActivity3 extends AppCompatActivity implements View.OnClickListener {
EditText ingre;
Button btningre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm3);
        btningre=findViewById(R.id.button2);
        btningre.setOnClickListener(this);
        ingre=findViewById(R.id.editText3);
    }

    @Override
    public void onClick(View view) {
        Intent reg =new Intent(this,frmActivity2.class);
        reg.putExtra("opc",Integer.parseInt(ingre.getText().toString()));
        startActivity(reg);
        finish();

    }
}
