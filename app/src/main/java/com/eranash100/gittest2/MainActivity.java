package com.eranash100.gittest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eranash100.libtest.Eran;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Eran eran = new Eran(5);
    }
}