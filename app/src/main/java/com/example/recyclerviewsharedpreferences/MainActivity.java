package com.example.recyclerviewsharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.recyclerviewsharedpreferences.R;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button login;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Boolean savelogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.login);

        sharedPreferences = getSharedPreferences("loginref", MODE_PRIVATE);
        editor = sharedPreferences.edit();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        savelogin = sharedPreferences.getBoolean("savelogin", true);
        if (savelogin == true) {
            user.setText(sharedPreferences.getString("username", null));
            pass.setText(sharedPreferences.getString("password", null));
            Intent intent = new Intent(MainActivity.this, com.example.recyclerviewsharedpreferences.Main2Activity.class);
            startActivity(intent);
        }
    }

    public void login() {
        String usrname = user.getText().toString();
        String passwoord = pass.getText().toString();
        if (usrname.equals("megaokt") && passwoord.equals("123")) {
            Toast.makeText(this, "LOGIN BERHASIL!", Toast.LENGTH_LONG).show();
            editor.putBoolean("savelogin", true);
            editor.putString("username", usrname);
            editor.putString("password", passwoord);
            editor.commit();
            Intent intent = new Intent(MainActivity.this, com.example.recyclerviewsharedpreferences.Main2Activity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "USERNAME DAN PASSWORD SALAH/TIDAK TERDAFTAR!", Toast.LENGTH_LONG).show();
        }
    }
}




