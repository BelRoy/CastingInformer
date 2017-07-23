package com.devqt.casting.infor.block_menu;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.devqt.casting.infor.Login;
import com.devqt.casting.infor.MainMenu;
import com.devqt.casting.infor.R;
import com.google.firebase.auth.FirebaseAuth;

public class ProfileMenu extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_menu); TextView textView = (TextView) findViewById(R.id.change_mail);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/appetite.ttf");
        textView.setTypeface(typeFace);
        TextView textView1 = (TextView) findViewById(R.id.change_pass);
        Typeface typeFace1 = Typeface.createFromAsset(getAssets(), "fonts/appetite.ttf");
        textView1.setTypeface(typeFace1);
        TextView textView2 = (TextView) findViewById(R.id.delete_acc);
        Typeface typeFace2 = Typeface.createFromAsset(getAssets(), "fonts/appetite.ttf");
        textView2.setTypeface(typeFace2);
    }

    private void signOut()
    {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(ProfileMenu.this, Login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_prf, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.back_out:
                Intent back_out = new Intent(this,MainMenu.class);
                this.startActivity(back_out); finish();
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