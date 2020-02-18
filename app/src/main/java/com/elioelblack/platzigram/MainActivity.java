package com.elioelblack.platzigram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.elioelblack.platzigram.view.CreateAccountActivity;
import com.elioelblack.platzigram.view.ContainerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goHomeLogin(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
    public void goPlatziPage(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.platzi.com/"));
        startActivity(intent);
    }
}
