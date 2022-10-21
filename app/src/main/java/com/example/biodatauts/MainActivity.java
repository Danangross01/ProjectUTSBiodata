package com.example.biodatauts;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telefon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082218516663"));
        startActivity(intent);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:danangprasetya123123@gmail.com"));
        startActivity(intent);
    }

    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/7%C2%B026'50.7%22S+109%C2%B015'17.6%22E/@-7.4474188,109.2526874,17z/data=!3m1!4b1!4m4!3m3!8m2!3d-7.4474241!4d109.2548761"));
        startActivity(intent);
    }
}