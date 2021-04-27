package com.example.lat2_if1_10118043_dianrosapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class verifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
    }
    public void pindah_userhome (View view){
        Intent pindah_almost = new Intent(this, userHome.class);
        startActivity(pindah_almost);
    }
}