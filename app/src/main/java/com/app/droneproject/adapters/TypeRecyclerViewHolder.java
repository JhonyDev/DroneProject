package com.app.droneproject.adapters;

import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.droneproject.R;


public class TypeRecyclerViewHolder extends RecyclerView.ViewHolder {

    EditText bloodPressure;
    EditText age;
    EditText gender;

    public TypeRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        bloodPressure = itemView.findViewById(R.id.iv_image);
        age = itemView.findViewById(R.id.iv_capture);
        gender = itemView.findViewById(R.id.tv_plant_name);
    }

}


