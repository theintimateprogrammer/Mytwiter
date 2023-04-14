package com.example.mytwiter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

     ListView list;

    String name[]={"yash","raj","milan","riya","ravi","krishna","ram","akash","rahi","avni","gautam"};
    String  image [] = {"image1","immage2","image3","image4","image5","imag6","imag7","imag8","imag8","image9","image10","image11"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        String name[]={"yash","raj","milan","riya","ravi","krishna","ram","akash","rahi","avni","gautam"};
        String  image [] = {"img_1","img_2","image3","image4","image5","imag6","imag7","imag8","imag8","image9","image10","image11"};










    }
}