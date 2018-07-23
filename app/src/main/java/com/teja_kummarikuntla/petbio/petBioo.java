package com.teja_kummarikuntla.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class petBioo extends AppCompatActivity {

    ImageView petimg;
    TextView txtBio;
    TextView textName;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_bioo);

        petimg = findViewById(R.id.ptimgAct2);
        txtBio = findViewById(R.id.textView2);
        textName = findViewById(R.id.textView1);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("Name");
            String bio = extras.getString("Bio");

            setup(name,bio);
        }


    }

    public void setup(String name, String bio) {
        if(name.equals("sushyyy")){

            petimg.setImageDrawable(getResources().getDrawable(R.drawable.pp));
            textName.setText(name);
            txtBio.setText(bio);

        } else if (name.equals("huhuhu")) {
            petimg.setImageDrawable(getResources().getDrawable(R.drawable.pp1));
            textName.setText(name);
            txtBio.setText(bio);
        }

    }
}
