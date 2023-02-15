package com.example.tuan01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edName;
Button btOK;
TextView tvShow;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh xạ
        edName = findViewById(R.id.edName);
        btOK = findViewById(R.id.btOK);
        tvShow = findViewById(R.id.btShow);
        //
        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //lấy dữ liệu
                String name= edName.getText().toString();
            //gán dữ liệu
                if(name.isEmpty())
                    tvShow.setText("Vui lòng nhập tên");
                else
                    tvShow.setText("Xin chào"+name);
            }
        });

        }
    }


