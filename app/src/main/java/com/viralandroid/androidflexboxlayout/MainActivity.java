package com.viralandroid.androidflexboxlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void flexboxLayout1(View view) {
        Intent intent = new Intent(getApplicationContext(), FlexboxLayoutExampleOne.class);
        startActivity(intent);
    }

    public void flexboxLayout2(View view) {
        Intent intent1 = new Intent(getApplicationContext(), FlexboxLayoutExampleTwo.class);
        startActivity(intent1);
    }

    public void flexboxLayout3(View view) {
        Intent intent2 = new Intent(getApplicationContext(), FlexboxLayoutExampleThree.class);
        startActivity(intent2);
    }
}
