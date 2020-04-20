package com.example.menuoverflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int option_id = item.getItemId();
        String option_text = item.getTitle()+"";
        Toast.makeText(this, "Selected "+option_text, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
