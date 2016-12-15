package com.example.balva.ejerciciodosfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

public class fragment2 extends Fragment {
     public fragment2(){

     }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String data = getActivity().getIntent().getStringExtra("texto");
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        TextView texto = (TextView) view.findViewById(R.id.texto);
        texto.setText(data);
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }
}
