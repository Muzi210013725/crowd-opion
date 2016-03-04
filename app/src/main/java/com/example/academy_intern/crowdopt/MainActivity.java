package com.example.academy_intern.crowdopt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public boolean onCreateOptionsMenu(Menu menu){
          getMenuInflater().inflate(R.menu.menu_main, menu);
          return true;

    }

        public void onButtonClick(View v) {
        if(v.getId() == R.id.bLogin){
            Intent i = new Intent(MainActivity.this, login.class);
            startActivity(i);

        }
        if(v.getId() == R.id.bSignup){
            Intent i = new Intent(MainActivity.this, Register.class);
            startActivity(i);

    }
    }

}
