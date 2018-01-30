package com.example.nassh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText e;
    RadioButton r1, r2;
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.bdt);
        r1 = findViewById(R.id.usd);
        r2 = findViewById(R.id.cad);
        b = findViewById(R.id.convert);
        t = findViewById(R.id.tv);

        b.setOnClickListener(this);

    }


    public void onClick (View view){
        String s = e.getText().toString();
        Double b = Double.parseDouble(s);

        if (r1.isChecked()){
            b = b/80.00;
            t.setText(String.valueOf(b));
        }
        else if (r2.isChecked()){
            b = b/60.00;
            t.setText(String.valueOf(b));
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
