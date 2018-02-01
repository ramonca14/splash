package com.maxi.android.curso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.maxi.android.curso.activity.CollapsingToolBarActivity;
import com.maxi.android.curso.activity.CustomListViewActivity;
import com.maxi.android.curso.activity.DialogActivity;
import com.maxi.android.curso.activity.LineraLayoutActivity;
import com.maxi.android.curso.activity.ListActivity;
import com.maxi.android.curso.activity.SimpleListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLinearLayoutActivity(v);
            }
        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                launchToast(v);
                return true;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCollapsingToolBarActivity(v);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSimpleListViewActivity(v);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCustomListViewActivity(v);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchListActivity(v);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDialog(v);
            }
        });
    }

    public void launchLinearLayoutActivity(View view){
        Intent i = new Intent(this, LineraLayoutActivity.class);
        startActivity(i);
    }

    public void launchCollapsingToolBarActivity(View view){
        Intent intent = new Intent(this, CollapsingToolBarActivity.class);
        startActivity(intent);
    }

    public void launchSimpleListViewActivity(View view){
        Intent intent = new Intent(this, SimpleListViewActivity.class);
        startActivity(intent);
    }

    public void launchCustomListViewActivity(View view){
        Intent intent = new Intent(this, CustomListViewActivity.class);
        startActivity(intent);
    }

    public void launchListActivity(View view){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void launchDialog(View view){
        Intent intent = new Intent(this, DialogActivity.class);
        startActivity(intent);
    }

    public void launchToast(View view){
        Toast.makeText(this, "Esto es un Toast", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.info_details:
                Toast.makeText(this, "Info pressed", Toast.LENGTH_LONG).show();
                break;
            case R.id.search:
                Toast.makeText(this, "Search pressed", Toast.LENGTH_LONG).show();
                break;
            case R.id.add:
                Toast.makeText(this, "Add pressed", Toast.LENGTH_LONG).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
