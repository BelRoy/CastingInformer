package com.devqt.casting.infor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;


public class Profile extends AppCompatActivity {


    protected void onCreate(Bundle savedStateInstance){

        super.onCreate(savedStateInstance);
        setContentView(R.layout.profile_act);


      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

}