package com.tarapus.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_movies = (Button) findViewById(R.id.button);
        btn_movies.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_movies.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will Launch my Movie App!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_scores = (Button) findViewById(R.id.button2);
        btn_scores.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_scores.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will Launch my Scores App!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_library = (Button) findViewById(R.id.button3);
        btn_library.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_library.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will Launch my Library App!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_bigger = (Button) findViewById(R.id.button4);
        btn_bigger.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_bigger.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will Launch my Build it Bigger App!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_xyz = (Button) findViewById(R.id.button5);
        btn_xyz.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_xyz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will Launch my XYZ Reader App!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_capstone = (Button) findViewById(R.id.button6);
        btn_capstone.setBackgroundColor(getResources().getColor(R.color.red));
        btn_capstone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will Launch my Capstone App!", Toast.LENGTH_SHORT).show();
            }
        });

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
}
