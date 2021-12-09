package com.appsol360.arithmaticlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.appsol360.arithmatic.Arithmatic;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float d=Arithmatic.Sum(5,8);
        Toast.makeText(getApplicationContext(), "Answer is: "+d, Toast.LENGTH_SHORT).show();
    }
}