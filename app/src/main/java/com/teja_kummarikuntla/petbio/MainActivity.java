package com.teja_kummarikuntla.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     private ImageView cat1;
     private ImageView cat2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat1 = findViewById(R.id.cat1);
        cat2 = findViewById(R.id.cat2);

        cat1.setOnClickListener(this);
        cat2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cat1:
                Intent catIntetn = new Intent(MainActivity.this,petBioo.class);
                catIntetn.putExtra("Name","sushyyy");
                catIntetn.putExtra("Bio","grey cat love people and meowss alot");
                startActivity(catIntetn);
                break;
            case R.id.cat2:
                Intent cat2 = new Intent(MainActivity.this,petBioo.class);
                cat2.putExtra("Name","huhuhu");
                cat2.putExtra("Bio","grey cat love people and meowss alot and eats alot");
                startActivity(cat2);

                break;

        }





    }
}
