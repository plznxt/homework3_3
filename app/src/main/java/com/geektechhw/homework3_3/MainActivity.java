package com.geektechhw.homework3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadData();
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
    private void loadData(){
        address = new ArrayList<>();
        address.add("street");
        address.add("street1");
        address.add("street2");
        address.add("street3");
        address.add("street4");
        address.add("street5");
        address.add("street6");
        address.add("street7");
        address.add("street8");
        address.add("street9");
        address.add("street10");
        address.add("street11");
        address.add("street12");
        address.add("street13");
        address.add("street14");
        address.add("street15");
        address.add("street16");
        address.add("street17");
        address.add("street18");
        address.add("street19");
        address.add("street20");
        address.add("street21");
        address.add("street22");
    }
}