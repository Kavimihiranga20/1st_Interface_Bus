package com.example.a1st_interface_bus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        String[] value = {"Language","English","Sinhala","Tamil"};
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(value));
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.style_spinner,arrayList);





        //attaching data adapter to spinner
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).equals("Choose Category")) {
                    //do nothing

                } else {
                    //on selecting a spinner item
                    String item = parent.getItemAtPosition(position).toString();

                    //show  selected spinner item
                    Toast.makeText(parent.getContext(), "Selected " + item, Toast.LENGTH_SHORT).show();

                    //anything else you want to do on item selection do here


                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Todo Auto-generated method stub
            }
        });

    }

}




