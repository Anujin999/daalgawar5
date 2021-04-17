package com.example.assignment55;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                int id = item.getItemId();
                if (id == R.id.item1) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                    return true;
                }
        }
        switch (item.getItemId()) {
            case R.id.item2:
                int id = item.getItemId();
                if (id == R.id.item2){
                    Intent i = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(i);
                    return true;
                            }
        }
        switch (item.getItemId()) {
            case R.id.item3:
                int id = item.getItemId();
                if (id == R.id.item3){
                    Intent i = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(i);
                    return true;
                }

        }
        switch (item.getItemId()) {
            case R.id.item4:
                int id = item.getItemId();
                if (id == R.id.item4){
                    Intent i = new Intent(MainActivity.this, MainActivity5.class);
                    startActivity(i);
                    return true;
                }

        }
        switch (item.getItemId()) {
            case R.id.item5:
                int id = item.getItemId();
                if (id == R.id.item5){
                    Intent i = new Intent(MainActivity.this, MainActivity6.class);
                    startActivity(i);
                    return true;
                }

        }
                return super.onOptionsItemSelected(item);
        }
    }
