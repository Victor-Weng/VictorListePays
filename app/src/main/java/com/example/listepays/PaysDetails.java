package com.example.listepays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PaysDetails extends AppCompatActivity {
    private TextView nomPays,txtSuperficie,txtCapital;
    private ImageView imgDrapeau,imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays_details);
        nomPays=findViewById(R.id.nomPays);
        txtSuperficie=findViewById(R.id.txtSuperficie);
        imgDrapeau=findViewById(R.id.imgDrapeau);
        txtCapital=findViewById(R.id.txtCapital);
        imgPhoto=findViewById(R.id.imgPhoto);

        Bundle extras=getIntent().getExtras();
        String nom=extras.getString("nom");
        int sup=extras.getInt("superficie");
        int drap=extras.getInt("drapeau");
        String cap=extras.getString("capital");
        int pho=extras.getInt("photo");

        txtSuperficie.setText("Superficie : " + String.valueOf(sup)+ " km\u00B2");
        nomPays.setText(nom);
        txtCapital.setText("Capital:" + String.valueOf(cap));
        imgPhoto.setImageResource(pho);
        imgDrapeau.setImageResource(drap);

    }
}