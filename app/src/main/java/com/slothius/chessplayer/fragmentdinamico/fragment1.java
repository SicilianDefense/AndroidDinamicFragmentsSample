package com.slothius.chessplayer.fragmentdinamico;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ChessPlayer on 2016/03/17.
 */
public class fragment1 extends Fragment implements View.OnClickListener {
   Button buttonFragment;
    public fragment1(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view;
        view = inflater.inflate(R.layout.fragment1,container,false);
        buttonFragment = (Button)view.findViewById(R.id.CambioColor);
        buttonFragment.setOnClickListener(this);

        return view;
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.CambioColor:
                Toast.makeText(getActivity(),"cambia de color",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public interface OnFragmentInteractionListener1{

        public void onFragmentInteraction1(Uri uri);
    }
}
