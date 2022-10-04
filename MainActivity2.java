package com.example.dikri_mahali_ramdani_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText edun, eduts, eduas;
    TextView edakhir;
    Button bthitung ;
    Double vun, vuts, vuas, vakhir ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edun = (EditText) findViewById(R.id.edun);
        eduts = (EditText) findViewById(R.id.eduts);
        eduas = (EditText) findViewById(R.id.eduas);
        bthitung = (Button) findViewById(R.id.bthitung);
        edakhir = (TextView) findViewById(R.id.edakhir);
    }

    public void hitung(View view){
        vun = Double.parseDouble(edun.getText().toString());
        vuts = Double.parseDouble(eduts.getText().toString());
        vuas = Double.parseDouble(eduas.getText().toString());


        vakhir = (0.25 * vun) + (0.25 * vuts) + (0.50 * vuas);

        edakhir.setText(""+vakhir);
    }
}
