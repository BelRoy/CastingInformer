package com.devqt.casting.infor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Profile extends AppCompatActivity {

    String[] sex = {"Male", "Female"};

    protected void onCreate(Bundle savedStateInstance){

        super.onCreate(savedStateInstance);
        setContentView(R.layout.profile_act);


      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);

        Spinner spinner = (Spinner) findViewById(R.id.sex);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sex);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

}