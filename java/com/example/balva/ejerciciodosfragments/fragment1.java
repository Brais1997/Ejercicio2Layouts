package com.example.balva.ejerciciodosfragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment1 extends Fragment {

    public fragment1(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    public void copiarTexto(View v){
     Button b = (Button)v;
     String texto = (String) b.getText();
     Intent i = new Intent(getContext(),fragment2.class);
     i.putExtra("texto",texto);
     startActivity(i);
 }

}
