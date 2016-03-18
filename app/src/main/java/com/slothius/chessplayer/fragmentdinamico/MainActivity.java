package com.slothius.chessplayer.fragmentdinamico;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, fragment1.OnFragmentInteractionListener1, BlankFragment.OnFragmentInteractionListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.CambiarFragment);
        button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v){

    switch(v.getId())

    {
        case R.id.CambiarFragment:


            //switching fragments each time i press the button
            if (button.getText().toString().equals("Cambiar Fragment")){
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragment1 fragment = new fragment1();

                fragmentTransaction.replace(R.id.layoutprincipal, fragment);
                fragmentTransaction.commit();
                button.setText("cambiar fragment 1");
              break;
            }



            if (button.getText().toString().equals("cambiar fragment 1")){
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    BlankFragment fragmentx = new BlankFragment();

                    fragmentTransaction.replace(R.id.layoutprincipal, fragmentx);
                    fragmentTransaction.commit();
                    button.setText("Cambiar Fragment");
                break;
                }


            }
    }



    @Override
    public void onFragmentInteraction1(Uri uri) {
        //puedo dejarlo en blanco
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
