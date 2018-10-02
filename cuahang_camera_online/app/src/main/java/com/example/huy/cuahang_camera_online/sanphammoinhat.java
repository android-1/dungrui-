package com.example.huy.cuahang_camera_online;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class sanphammoinhat extends AppCompatActivity {
    ListView listView;
    ViewFlipper viewFlipper;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanphammoinhat);
    }

    private void ActionViewFlipper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("http://ngoinhaantoan.vn/wp-content/uploads/2017/08/camera-CV-panasonic-CFN103L.jpg");
        mangquangcao.add("http://ngoinhaantoan.vn/wp-content/uploads/2017/12/CAMERA-IP-DOME-HIKVISION-2.0MP-DS-2CD2522FWD-I.jpg");
        mangquangcao.add("http://ngoinhaantoan.vn/wp-content/uploads/2017/08/camera-CVI-panasonic-CV-CPW103L.png");
        mangquangcao.add("http://ngoinhaantoan.vn/wp-content/uploads/2017/12/CAMERA-IP-DOME-HIKVISION-2.0MP-DS-2CD2522FWD-I.jpg");
        for(int i = 0; i< mangquangcao.size(); i++) {
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);
    }



}
