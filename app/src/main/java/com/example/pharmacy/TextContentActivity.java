package com.example.pharmacy;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pharmacy.database.MyConstants;

public class TextContentActivity extends AppCompatActivity {
    private int category = 0;
    private int position = 0;
    private Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);


//        cursor = MainActivity.dbManager.getDatabase().query(MyConstants.TABLE_NAME, null, null,
//                null, null, null, null);

        reciveIntent();



    }

    private void reciveIntent(){
        Intent intent = getIntent();
        if(intent != null){
            category = intent.getIntExtra("category", 0);
        }
        switch(category){
            case 0:
                outputMed();
                break;
            case 1:
                outputAdditionalInfo();
                break;
            case 2:
                outputMedDevice();
                break;
            case 3:
                outputMedHelp();
                break;
        }
    }

    private void outputMedDevice() {
        TextView text = findViewById(R.id.description);
        String setText;
        Cursor cursor;
        Bundle arguments = getIntent().getExtras();
        cursor = MainActivity.dbManager_conditions.getDatabase().query(MyConstants.TABLE_NAME,
                null,
                MyConstants.TITLE+ " LIKE '"+arguments.get("position").toString()+"%'",
                null, null, null, MyConstants._ID + " DESC");
        Integer i = cursor.getCount();

        cursor.moveToFirst();
        text = findViewById(R.id.med_name);
        text.setText(arguments.get("position").toString());

        ImageView imageView = findViewById(R.id.image);
        int resId=TextContentActivity.this.getResources().getIdentifier(cursor.getString(2),
                "drawable", TextContentActivity.this.getPackageName());
        imageView.setImageResource(resId);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(630, 630);
        imageView.setLayoutParams(layoutParams);
        layoutParams.gravity = Gravity.CENTER;

        cursor.moveToNext();
        text = findViewById(R.id.indication);
        setText = cursor.getString(2);
        text.setText(setText);

        cursor.moveToNext();
        text = findViewById(R.id.composition);
        setText = cursor.getString(2);
        text.setText(setText);

        text = findViewById(R.id.desc);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        cursor.moveToNext();
        setText=cursor.getString(2);
        text = findViewById(R.id.description);
        text.setText(setText);

        text = findViewById(R.id.comp);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);


        text = findViewById(R.id.effect);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.eff);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.meth);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.method);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.indic);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.contraindication);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.contra);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.side);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.overdose);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.condition);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.cond);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.side_effect);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.over);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

    }

    private void outputAdditionalInfo() {
        TextView text = findViewById(R.id.description);
        String setText;
        Cursor cursor;
        Bundle arguments = getIntent().getExtras();
        cursor = MainActivity.dbManager_conditions.getDatabase().query(MyConstants.TABLE_NAME,
                null,
                MyConstants.TITLE+ " LIKE '"+arguments.get("position").toString()+"%'",
                null, null, null, MyConstants._ID + " DESC");
        Integer i = cursor.getCount();

        cursor.moveToFirst();
        text = findViewById(R.id.med_name);
        text.setText(arguments.get("position").toString());

        ImageView imageView = findViewById(R.id.image);
        int resId=TextContentActivity.this.getResources().getIdentifier(cursor.getString(2),
                "drawable", TextContentActivity.this.getPackageName());
        imageView.setImageResource(resId);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(630, 630);
        imageView.setLayoutParams(layoutParams);
        layoutParams.gravity = Gravity.CENTER;

        cursor.moveToNext();

        text = findViewById(R.id.indication);
        setText = cursor.getString(2);
        text.setText(setText);

        cursor.moveToNext();
        text = findViewById(R.id.composition);
        setText = cursor.getString(2);
        text.setText(setText);

        text = findViewById(R.id.desc);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        cursor.moveToNext();
        setText=cursor.getString(2);
        text = findViewById(R.id.description);
        text.setText(setText);

        text = findViewById(R.id.comp);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);


        text = findViewById(R.id.effect);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.eff);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.meth);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.method);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.indic);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.contraindication);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.contra);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.side);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.overdose);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.condition);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.cond);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.side_effect);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.over);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);


    }

    private void outputMedHelp() {
        TextView text = findViewById(R.id.description);
        String setText;
        Cursor cursor;
        Bundle arguments = getIntent().getExtras();
        cursor = MainActivity.dbManager_conditions.getDatabase().query(MyConstants.TABLE_NAME,
                null,
                MyConstants.TITLE+ " LIKE '"+arguments.get("position").toString()+"%'",
                null, null, null, MyConstants._ID + " DESC");
        Integer i = cursor.getCount();

        cursor.moveToFirst();
        text = findViewById(R.id.med_name);
        text.setText(arguments.get("position").toString());

        ImageView imageView = findViewById(R.id.image);
        int resId=TextContentActivity.this.getResources().getIdentifier(cursor.getString(2),
                "drawable", TextContentActivity.this.getPackageName());
        imageView.setImageResource(resId);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(630, 630);
        imageView.setLayoutParams(layoutParams);
        layoutParams.gravity = Gravity.CENTER;

        cursor.moveToNext();

        text = findViewById(R.id.indication);
        setText = cursor.getString(2);
        text.setText(setText);

        cursor.moveToNext();
        text = findViewById(R.id.composition);
        setText = cursor.getString(2);
        text.setText(setText);

        text = findViewById(R.id.desc);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        cursor.moveToNext();
        setText=cursor.getString(2);
        text = findViewById(R.id.description);
        text.setText(setText);

        text = findViewById(R.id.comp);
        text.setText("О витаминах");


        text = findViewById(R.id.effect);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.eff);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.meth);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.method);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.indic);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.contraindication);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.contra);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.side);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.overdose);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.condition);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.cond);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.side_effect);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);

        text = findViewById(R.id.over);
        text.setVisibility(View.INVISIBLE);
        text.setTextSize(0);


    }

    private void outputMed(){
        TextView text = findViewById(R.id.description);
        String setText;
        Cursor cursor;
        Bundle arguments = getIntent().getExtras();
        cursor = MainActivity.dbManager_conditions.getDatabase().query(MyConstants.TABLE_NAME,
                null,
                MyConstants.TITLE+ " LIKE '"+arguments.get("position").toString()+"%'",
                null, null, null, MyConstants._ID + " DESC");
        Integer i = cursor.getCount();

        cursor.moveToFirst();
        //имя
        text = findViewById(R.id.med_name);
        text.setText(arguments.get("position").toString());

        //изображение
        ImageView imageView = findViewById(R.id.image);
        int resId=TextContentActivity.this.getResources().getIdentifier(cursor.getString(2),
                "drawable", TextContentActivity.this.getPackageName());
        imageView.setImageResource(resId);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(630, 630);
        imageView.setLayoutParams(layoutParams);
        layoutParams.gravity = Gravity.CENTER;


        //условия хранения
        cursor.moveToNext();
        text = findViewById(R.id.condition);
        setText = cursor.getString(2);
        text.setText(setText);

        //передозировка
        cursor.moveToNext();
        text = findViewById(R.id.overdose);
        setText = cursor.getString(2);
        text.setText(setText);

        //побочки
        cursor.moveToNext();
        text = findViewById(R.id.side_effect);
        setText = cursor.getString(2);
        text.setText(setText);

        //метод применения
        cursor.moveToNext();
        text = findViewById(R.id.method);
        setText = cursor.getString(2);
        text.setText(setText);

        //противопоказания
        cursor.moveToNext();
        text = findViewById(R.id.contraindication);
        setText = cursor.getString(2);
        text.setText(setText);

        //показания
        cursor.moveToNext();
        text = findViewById(R.id.indication);
        setText = cursor.getString(2);
        text.setText(setText);

        //эффект
        cursor.moveToNext();
        text = findViewById(R.id.effect);
        setText = cursor.getString(2);
        text.setText(setText);

        //действующие средства
        cursor.moveToNext();
        text = findViewById(R.id.composition);
        setText = cursor.getString(2);
        text.setText(setText);

        //описание
        cursor.moveToNext();
        text = findViewById(R.id.description);
        setText = cursor.getString(2);
        text.setText(setText);


        cursor.close();
    }
}

