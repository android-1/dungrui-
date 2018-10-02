package com.example.huy.cuahang_camera_online;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GioHang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
    }


}
