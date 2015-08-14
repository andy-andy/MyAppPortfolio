package com.tarapus.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_movies = (Button) findViewById(R.id.btn_movies);
        btn_movies.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_movies.setOnClickListener(this);

        Button btn_scores = (Button) findViewById(R.id.btn_scores);
        btn_scores.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_scores.setOnClickListener(this);

        Button btn_library = (Button) findViewById(R.id.btn_library);
        btn_library.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_library.setOnClickListener(this);

        Button btn_bigger = (Button) findViewById(R.id.btn_bigger);
        btn_bigger.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_bigger.setOnClickListener(this);

        Button btn_xyz = (Button) findViewById(R.id.btn_xyz);
        btn_xyz.setBackgroundColor(getResources().getColor(R.color.orange));
        btn_xyz.setOnClickListener(this);

        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);
        btn_capstone.setBackgroundColor(getResources().getColor(R.color.red));
        btn_capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_movies:
                Toast.makeText(getApplicationContext(), "This button will Launch my Movie App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_scores:
                Toast.makeText(getApplicationContext(), "This button will Launch my Scores App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_library:
                Toast.makeText(getApplicationContext(), "This button will Launch my Library App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_bigger:
                Toast.makeText(getApplicationContext(), "This button will Launch my Build it Bigger App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_xyz:
                Toast.makeText(getApplicationContext(), "This button will Launch my XYZ Reader App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(), "This button will Launch my Capstone App!", Toast.LENGTH_SHORT).show();
                break;
        }
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

