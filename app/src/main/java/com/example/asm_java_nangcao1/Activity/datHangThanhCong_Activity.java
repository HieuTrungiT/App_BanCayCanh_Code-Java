package com.example.asm_java_nangcao1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.asm_java_nangcao1.R;

public class datHangThanhCong_Activity extends AppCompatActivity {
    private TextView DatHangThanhCong_tv_btn_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_hang_thanh_cong);
        anhXa();
        DatHangThanhCong_tv_btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(datHangThanhCong_Activity.this, gioHang_Activity.class);
                startActivity(intent);
            }
        });
    }

    private void anhXa() {
        DatHangThanhCong_tv_btn_check = (TextView) findViewById(R.id.datHangThanhCong_tv_btn_check);
    }
}