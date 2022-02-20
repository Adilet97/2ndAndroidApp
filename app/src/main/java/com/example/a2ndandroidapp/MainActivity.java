package com.example.a2ndandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText address,password;
    private Button btn1;
    private TextView T1,T2,T3,item2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.Text3);
        btn1 = (Button) findViewById(R.id.btn1);
        T1 = (TextView) findViewById(R.id.T1);
        T2 = (TextView) findViewById(R.id.T2);
        T3 = (TextView) findViewById(R.id.T3);
        item2 = (TextView) findViewById(R.id.item2);

        address.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (address.getText().toString().isEmpty()) {
                    btn1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btn1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (address.getText().toString().equals("admin") &&
            password.getText().toString().equals("admin")){
                address.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                btn1.setVisibility(View.GONE);
                T1.setVisibility(View.GONE);
                T2.setVisibility(View.GONE);
                T3.setVisibility(View.GONE);
                item2.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this, "Вы вошли успешно!", Toast.LENGTH_LONG).show();}
            else {
                Toast.makeText(MainActivity.this, "Вы неправильно ввели пароль!", Toast.LENGTH_LONG).show();
            }
        }
    });

    }


}
