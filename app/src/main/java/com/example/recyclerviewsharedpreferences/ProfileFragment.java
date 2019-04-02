package com.example.recyclerviewsharedpreferences;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment implements MainView {

    List<NovelModel> novelModels = new ArrayList<>();
    NovelAdapter adapter;



    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new NovelAdapter(getContext(), novelModels);
        recyclerView.setAdapter(adapter);
        NovelData data = new NovelData ((MainView) this,getContext());
        data.setData();
    }




    @Override
    public void onSuccess(List<NovelModel> modelNovels) {
        this.novelModels.clear();
        this.novelModels.addAll(modelNovels);
        this.adapter.notifyDataSetChanged();
    }


}