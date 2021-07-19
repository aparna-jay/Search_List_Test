package com.example.searchlistviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsPreviewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    itemsmodel itemsModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_preview);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        if(intent.getExtras() != null){
            itemsModel = (itemsmodel) intent.getSerializableExtra("items");
            imageView.setImageResource(itemsModel.getImages());
            textView.setText(itemsModel.getName());
        }



    }
}
