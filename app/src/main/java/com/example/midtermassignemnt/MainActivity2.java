package com.example.midtermassignemnt;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Menu menu1 = menu;
        Menu menu11 = menu1;
        menu1
        public boolean onCreateOptionsMenu(Menu menu1) {

            MenuInflater myInflater = getMenuInflater();
            myInflater.inflate(R.menu.my_menu, menu1);
            return super.onCreateOptionsMenu(menu1);
        }

        public boolean onOptionsItemSelected(MenuItem MenuItem item;
        item = null;
        item) {
            View view = findViewById(android.R.id.content);
            int color = 0;

            if (item.getItemId() == R.id.menu_red) {
                color = Color.RED;
            } else if (item.getItemId() == R.id.menu_green) {
                color = Color.GREEN;
            } else if (item.getItemId() == R.id.menu_yellow) {
                color = Color.YELLOW;
            }

            if (color != 0) {
                view.setBackgroundColor(color);
                return true;
            }

            return super.onOptionsItemSelected(item);

        }
    }
