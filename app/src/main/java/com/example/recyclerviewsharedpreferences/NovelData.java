package com.example.recyclerviewsharedpreferences;

import android.content.Context;


import java.util.ArrayList;
import java.util.List;

public class NovelData {
    Context context;
    List<NovelModel> novelModels = new ArrayList<>();
    MainView view;
    public NovelData (MainView view,Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        NovelModel novel;

        novel = new NovelModel( "Andrea Hirata: Edensor",R.drawable.edensorr);
        novelModels.add(novel);
        novel = new NovelModel( "Andrea Hirata: Ayah",R.drawable.ayah);
        novelModels.add(novel);
        novel = new NovelModel( "Andrea Hirata: Maryamah Karpov",R.drawable.maryamahkarpov);
        novelModels.add(novel);
        novel = new NovelModel( "Andrea Hirata: Padang Bulan",R.drawable.padangbulan);
        novelModels.add(novel);
        novel = new NovelModel( "Andrea Hirata: Sang Pemimpi",R.drawable.sangpemimpi);
        novelModels.add(novel);
        novel = new NovelModel( "Pramudya Ananta Noer: Bumi Manusia",R.drawable.bumimanusia);
        novelModels.add(novel);







        view.onSuccess(novelModels);

    }
}
