package com.example.root.mcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuAdapter adapter;
    private List<MenuProperties> menuList;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        menuList = new ArrayList<>();
        adapter = new MenuAdapter(this, menuList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareDashItems();
    }

    private void prepareDashItems() {
        int[] covers = new int[]{
                R.drawable.ptop,
                R.drawable.building,
                R.drawable.overview,
                R.drawable.aboutauthor
        };

        MenuProperties d = new MenuProperties("Point to Point Locator","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus turpis tellus, pulvinar non fermentum vitae, consectetur sed lectus. Donec vitae.\n" +
                "\n",covers[0]);
        menuList.add(d);
        d = new MenuProperties("Building History","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus turpis tellus, pulvinar non fermentum vitae, consectetur sed lectus. Donec vitae.\n" +
                "\n",covers[1]);
        menuList.add(d);
        d = new MenuProperties("Overview of MCU","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus turpis tellus, pulvinar non fermentum vitae, consectetur sed lectus. Donec vitae.\n" +
                "\n",covers[2]);
        menuList.add(d);
        d = new MenuProperties("About Author","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus turpis tellus, pulvinar non fermentum vitae, consectetur sed lectus. Donec vitae.\n" +
                "\n",covers[3]);
        menuList.add(d);

        adapter.notifyDataSetChanged();
    }
}
