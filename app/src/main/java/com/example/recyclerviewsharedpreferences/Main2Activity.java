package com.example.recyclerviewsharedpreferences;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.recyclerviewsharedpreferences.NovelFragment;
import com.example.recyclerviewsharedpreferences.ProfileFragment;
import com.example.recyclerviewsharedpreferences.R;


public class Main2Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavigationView = findViewById(R.id.bnv);
        loadFragment(new ProfileFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }


    private  boolean loadFragment (Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
        switch (menuItem.getItemId()) {

            case R.id.profile:
                fragment = new ProfileFragment();
                break;

            case R.id.novel:
                fragment = new NovelFragment();
                break;
        }
        return loadFragment(fragment);
    }

}


