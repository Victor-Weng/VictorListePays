package com.example.listepays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Pays> paysList;
    private PaysAdapter paysAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.recyclerView.getContext(),DividerItemDecoration.VERTICAL));

        paysList=new ArrayList<>();
        paysList.add(new Pays("Afganistan",R.drawable.afghanistan,652860,"Kabul",R.drawable.nasser));
        paysList.add(new Pays("Algérie",R.drawable.algeria,2382000,"Algiers [El Djazaïr]",R.drawable.nasser1));
        paysList.add(new Pays("Andorre",R.drawable.andorra,468,"Andorra la Vella",R.drawable.nasser2));
        paysList.add(new Pays("Belgique",R.drawable.belgium,30689,"Bruxelles",R.drawable.nasser3));
        /*paysList.add(new Pays("Bolivie",R.drawable.bolivia,1099000));
        paysList.add(new Pays("Bénin",R.drawable.benin,114763));
        paysList.add(new Pays("Brésil",R.drawable.brazil,8516000));
        paysList.add(new Pays("Canada",R.drawable.canada,9985000));
        paysList.add(new Pays("Egypte",R.drawable.egypt,1010000));
        paysList.add(new Pays("Ethiopie",R.drawable.ethiopia,1104000));
        paysList.add(new Pays("France",R.drawable.france,543940));
        paysList.add(new Pays("Inde",R.drawable.india,3287000));
        paysList.add(new Pays("Kenya",R.drawable.kenya,580367));
        paysList.add(new Pays("Luxembourg",R.drawable.luxembourg,2586));
        paysList.add(new Pays("Malaisie",R.drawable.malaysia,329847));
        paysList.add(new Pays("Mozambique",R.drawable.mozambique,801590));
        paysList.add(new Pays("Roumanie",R.drawable.romania,238397));
        paysList.add(new Pays("Tanzanie",R.drawable.tanzania,945087));
        paysList.add(new Pays("Tunisie",R.drawable.tunisia,163610));*/

        paysAdapter=new PaysAdapter(paysList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(paysAdapter);
    }
}