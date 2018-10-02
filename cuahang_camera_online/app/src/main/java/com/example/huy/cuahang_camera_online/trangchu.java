package com.example.huy.cuahang_camera_online;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class trangchu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "dangnhuhuy682@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
//        displayView(R.id.nav_trangchu);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.trangchu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.frameLayout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_trangchu) {
           displayView(R.id.nav_trangchu);
        } else if (id == R.id.nav_sanpham1) {
            displayView(R.id.nav_sanpham1);
        } else if (id == R.id.nav_sanpham2) {
           displayView(R.id.nav_sanpham2);
        } else if (id == R.id.nav_lienhe) {
           displayView(R.id.nav_lienhe);
        } else if (id == R.id.nav_giohang_trangchu) {
            displayView(R.id.nav_giohang_trangchu);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void displayView(int item){
        Intent intent = null;
        switch (item) {
            case R.id.nav_trangchu:
                intent = new Intent(this,sanphammoinhat.class);
                this.startActivity(intent);
                toolbar.setTitle("Hot sản phẩm");
                break;
            case R.id.nav_sanpham1:
                intent = new Intent(this,sanpham.class);
                this.startActivity(intent);
                toolbar.setTitle("Camera HAKVISION");
                break;
            case R.id.nav_sanpham2:
                intent = new Intent(this,sanpham.class);
                this.startActivity(intent);
                toolbar.setTitle("Camera PANASONIC");
                break;
            case R.id.nav_lienhe:
                intent = new Intent(this,lienhe.class);
                this.startActivity(intent);
                toolbar.setTitle("Liên hệ");
                break;
            case R.id.nav_giohang_trangchu:
                intent = new Intent(this,GioHang.class);
                this.startActivity(intent);
                toolbar.setTitle("Liên hệ");
                break;
        }
        if(intent ==null) {
            intent = new Intent(this,sanpham.class);
            this.startActivity(intent);
        }

    }


}
