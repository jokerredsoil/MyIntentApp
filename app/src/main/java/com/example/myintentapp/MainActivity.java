package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnmoveactivity = findViewById(R.id.btn_move_activity);
        Button btnmoveactivitydata = findViewById(R.id.btn_move_activity_data);
        Button btnDialPhone = findViewById(R.id.btn_dial_number);


       btnmoveactivity.setOnClickListener(this);
       btnmoveactivitydata.setOnClickListener(this);
       btnDialPhone.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent movewithdataIntent =new Intent(MainActivity.this,MoveWithDataActivity.class);
                movewithdataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Septian Nugraha");
                movewithdataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 35);
                startActivity(movewithdataIntent);
                break;

            case R.id.btn_dial_number:
                String phoneNumber = "081210841382";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }

    }
}
