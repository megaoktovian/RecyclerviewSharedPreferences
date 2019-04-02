package com.example.recyclerviewsharedpreferences;


public class NovelModel {
    String name;
    int gambar;

    public NovelModel(String name,  int gambar){
        this.name = name;
        this.gambar = gambar;
    }

    public int getGambar() {
        return gambar;
    }

    public String getName() {
        return name;
    }

}
