package com.iesvirgendelcarmen.dam.fragment07;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by matinal on 25/10/2017.
 */

public class Fragmento2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento2,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button btn1 = (Button) getActivity().findViewById(R.id.importarTexto2);
        Button btn2 = (Button) getActivity().findViewById(R.id.exportarTexto2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lbl = (TextView)getActivity().findViewById(R.id.texto1);
                Toast.makeText(getActivity(), lbl.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = (TextView) getActivity().findViewById(R.id.texto2);
                texto.setText("TOCADO FRAG1");
            }
        });
    }
}
