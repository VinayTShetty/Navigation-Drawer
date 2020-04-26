package com.navheader;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mdrawerLayout;
    Toolbar mtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_layout);
        initViews();
        usetoolbar();
        addHumberDesingnAndSync();
    }


    private void initViews() {
        mtoolbar = (Toolbar) findViewById(R.id.toolbar_mainActivity);
        mdrawerLayout = findViewById(R.id.drawerlayout);
    }

    private void usetoolbar() {
        setSupportActionBar(mtoolbar);
    }

    private void addHumberDesingnAndSync(){
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                mdrawerLayout,
                mtoolbar,
                R.string.nav_open,
                R.string.nav_close);
        mdrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }


    @Override
    public void onBackPressed() {
        if(mdrawerLayout.isDrawerOpen(GravityCompat.START)){
            mdrawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}
