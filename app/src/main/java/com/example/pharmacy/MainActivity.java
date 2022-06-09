package com.example.pharmacy;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pharmacy.database.DBManager;
import com.example.pharmacy.ui.gallery.GalleryFragment;
import com.example.pharmacy.ui.home.HomeFragment;
import com.example.pharmacy.ui.slideshow.SlideshowFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pharmacy.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity  //{
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listView;
    private String[] array;
    private ArrayList<String> listItem;
    private ArrayAdapter<String> adapter;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private int categoryIndex;
    public static DBManager dbManager_description;
    public static DBManager dbManager_composition;
    public static DBManager dbManager_effect;
    public static DBManager dbManager_indications;
    public static DBManager dbManager_contraindications;
    public static DBManager dbManager_method;
    public static DBManager dbManager_sideEffects;
    public static DBManager dbManager_overdose;
    public static DBManager dbManager_conditions;
    public static DBManager dbManager_address;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);


        // поиск
        editText = (EditText)findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                MainActivity.this.adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //создание списка
        listView = findViewById(R.id.list_item);
        array = getResources().getStringArray(R.array.med_array);
        Arrays.sort(array);
        listItem = new ArrayList<>(Arrays.asList(array));
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<String>(Arrays.asList(array)));
        listView.setAdapter(adapter);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.med_help)
                .setOpenableLayout(drawer)
                .build();

        //переход
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        // This line needs to be after setupWithNavController()
        navigationView.setNavigationItemSelectedListener(this);

        createTable();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, TextContentActivity.class);
                intent.putExtra("category", categoryIndex);
                intent.putExtra("position", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.nav_home) {
            array = getResources().getStringArray(R.array.med_array);
            Arrays.sort(array);
            listView.setAdapter(null);
            adapter.clear();
            adapter.addAll(array);
            listView.setAdapter(adapter);
            categoryIndex = 0;
        } else if (id == R.id.nav_gallery) {
            array = getResources().getStringArray(R.array.vit_array);
            Arrays.sort(array);
            listView.setAdapter(null);
            adapter.clear();
            adapter.addAll(array);
            listView.setAdapter(adapter);
            categoryIndex = 1;
        } else if (id == R.id.nav_slideshow) {
            array = getResources().getStringArray(R.array.care_array);
            Arrays.sort(array);
            listView.setAdapter(null);
            adapter.clear();
            adapter.addAll(array);
            listView.setAdapter(adapter);
            categoryIndex = 2;

        } else if (id == R.id.nav_medhelp) {
            array = getResources().getStringArray(R.array.med_help);
            Arrays.sort(array);
            listView.setAdapter(null);
            adapter.clear();
            adapter.addAll(array);
            listView.setAdapter(adapter);
            categoryIndex = 3;

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void createTable() {
        FillingDB fillingDB = new FillingDB();

        //писание
        dbManager_description = new DBManager(this);
        dbManager_description.openDB();
        fillingDB.createTable_description();

        //действующие вещества
        dbManager_composition = new DBManager(this);
        dbManager_composition.openDB();
        fillingDB.createTable_composition();

        //фармокологический эффект
        dbManager_effect = new DBManager(this);
        dbManager_effect.openDB();
        fillingDB.createTable_effect();

        //показания
        dbManager_indications = new DBManager(this);
        dbManager_indications.openDB();
        fillingDB.createTable_indications();

        //противопоказания
        dbManager_contraindications = new DBManager(this);
        dbManager_contraindications.openDB();
        fillingDB.createTable_contraindications();

        //способ применения
        dbManager_method = new DBManager(this);
        dbManager_method.openDB();
        fillingDB.createTable_method();

        //побочки
        dbManager_sideEffects = new DBManager(this);
        dbManager_sideEffects.openDB();
        fillingDB.createTable_sideEffects();

        //передоз
        dbManager_overdose = new DBManager(this);
        dbManager_overdose.openDB();
        fillingDB.createTable_overdose();

        //условия хранения
        dbManager_conditions = new DBManager(this);
        dbManager_conditions.openDB();
        fillingDB.createTable_conditions();

        //путь к картинке
        dbManager_address = new DBManager(this);
        dbManager_address.openDB();
        fillingDB.createTable_address();

    }


}