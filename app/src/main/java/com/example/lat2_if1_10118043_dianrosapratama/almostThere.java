package com.example.lat2_if1_10118043_dianrosapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class almostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }
    public void pindah_verify (View view){
        Intent pindah = new Intent(this, verifyAccount.class);
        startActivity(pindah);
    }
}