package com.app.droneproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.droneproject.R;
import com.app.droneproject.activities.DetailActivity;
import com.app.droneproject.activities.DiseaseActivity;
import com.app.droneproject.activities.PlantListActivity;
import com.app.droneproject.info.Info;
import com.app.droneproject.mvvm.pojos.Super;
import com.app.droneproject.mvvm.pojos.response.Capture;
import com.app.droneproject.mvvm.pojos.response.Disease;
import com.app.droneproject.mvvm.pojos.response.plant.Image;
import com.app.droneproject.mvvm.pojos.response.plant.Plant;

import java.util.List;


public class TypeRecyclerViewAdapter extends RecyclerView.Adapter<TypeRecyclerViewHolder> implements Info {

    private static final String TAG = "TAG";
    Context context;
    List<Super> listInstances;
    int type;

    public TypeRecyclerViewAdapter(Context context, List<Super> listInstances, int type) {
        this.context = context;
        this.listInstances = listInstances;
        this.type = type;
    }

    @NonNull
    @Override
    public TypeRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View view;
        view = li.inflate(R.layout.rv_captures, parent, false);
        return new TypeRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TypeRecyclerViewHolder holder, int position) {
        initCaptures(holder, position);
    }

    private void initCaptures(TypeRecyclerViewHolder holder, int position) {
        Capture capture = (Capture) listInstances.get(position);
        holder.ivCapture.setImageURI(capture.getImage());
    }

    @Override
    public int getItemCount() {
        return listInstances.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }
}
