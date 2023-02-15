package com.example.tuan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class TinhToanActivity extends AppCompatActivity {
    EditText edSoA, edSoB;
    Button btCong, btTru, btNhan, btChia;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_toan);

        // Ánh xạ
        edSoA = findViewById(R.id.edSoA);
        edSoB = findViewById(R.id.edSoB);
        btCong = findViewById(R.id.btCong);
        btTru = findViewById(R.id.btTru);
        btNhan = findViewById(R.id.btNhan);
        btChia = findViewById(R.id.btChia);
        tvShow = findViewById(R.id.tvKetQua);

        // Tính toán
        btCong.setOnClickListener(v -> TinhToan("Cong"));
        btTru.setOnClickListener(v -> TinhToan("Tru"));
        btNhan.setOnClickListener(v -> TinhToan("Nhan"));
        btChia.setOnClickListener(v -> TinhToan("Chia"));
    }//end Create
    //Hiển thị dữ liệu
    void ShowDate(int rs){
        tvShow.setText(String.valueOf(rs));
    }
    //Tính toán
    void TinhToan(String loai) {
        String txtSoA = edSoA.getText().toString();
        String txtSoB = edSoB.getText().toString();
        if (txtSoA.isEmpty() || txtSoB.isEmpty()){
            tvShow.setText("Vui lòng nhập A , B");
            return;
        }
        int a = Integer.valueOf(txtSoA);
        int b = Integer.valueOf(txtSoB);

        //Check loai
        switch(loai){
            case "Cong":
                ShowDate(a+b);
                break;
            case "Tru":
                ShowDate(a-b);
                break;
            case "Nhan":
                ShowDate(a*b);
                break;
            case "Chia":
                if(b==0)
                    tvShow.setText("Không thể chia cho 0!");
                else
                {
                    double rs = (double) a/b;
                    tvShow.setText(String.valueOf(rs));
                }
                break;
            }
        }
    }
