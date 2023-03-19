package com.example.uibasicspart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private TextView txtHello;
    private EditText edtTxtName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        edtTxtName = findViewById(R.id.edtTxtName);
        txtHello = findViewById(R.id.txtHello);
        txtHello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnHello:
                txtHello.setText("Hello " + edtTxtName.getText().toString() + "!");
                break;
            case R.id.txtHello:
                Toast.makeText(this, "Output Message Clicked!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}