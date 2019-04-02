package com.example.recyclerviewsharedpreferences;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailNovelActivity extends AppCompatActivity {
    TextView tvName;
    ImageView ivNovel;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        tvName = findViewById(R.id.tv_title);
        ivNovel = findViewById(R.id.iv_novel);


        String name = getIntent().getStringExtra("name");
        int gambar = getIntent().getIntExtra("gambar",0);

        tvName.setText(name);
        ivNovel.setImageResource(gambar);
    }
}
