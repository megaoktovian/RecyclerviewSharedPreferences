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


/**
 * A simple {@link Fragment} subclass.
 */
public class NovelFragment extends Fragment implements MainView {

    RecyclerView recyclerView, recyclerViewA, recyclerViewB;
    NovelAdapter adapter;
    List<NovelModel> novelModels = new ArrayList<>();
    public NovelFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_novel2, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new NovelAdapter(getContext(), novelModels);
        recyclerView.setAdapter(adapter);
        NovelData data = new NovelData(this,getContext());
        data.setData();
    }



    @Override
    public void onSuccess(List<NovelModel> novelModels) {
        this.novelModels.clear();
        this.novelModels.addAll(novelModels);
        this.adapter.notifyDataSetChanged();
    }

}
