package com.devqt.casting.infor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.devqt.casting.infor.block_menu.ProfileMenu;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;




public class MainMenu extends AppCompatActivity {



    protected void onCreate(Bundle savedStateInstance){

    super.onCreate(savedStateInstance);
    setContentView(R.layout.menu_main);
    }

   // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  //  setSupportActionBar(toolbar);


        private void signOut()
        {
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(MainMenu.this, Login.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.prof:
                Intent prof_intent = new Intent(this,ProfileMenu.class);
                this.startActivity(prof_intent); finish();
                return true;
            case R.id.exit:
               // Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                signOut(); finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}