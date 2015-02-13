package com.nrsmac.entrepreneurialadventure;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    int testVariable;
    int testVariable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testVariable = 4;
        testVariable2 = 5;

    }


}
