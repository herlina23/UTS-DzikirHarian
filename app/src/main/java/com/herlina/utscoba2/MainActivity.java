package com.herlina.utscoba2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageButton ton1 = (ImageButton) findViewById(R.id.button1);
        ImageButton ton2 = (ImageButton) findViewById(R.id.button2);
        ImageButton ton3 = (ImageButton) findViewById(R.id.button3);


        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, Fragment.class);
                startActivity(inte);
            }
        });
        ton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte2 = new Intent(MainActivity.this, Emoticon.class);
                startActivity(inte2);
            }
        });
        ton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte2 = new Intent(MainActivity.this, Fbs.class);
                startActivity(inte2);
            }
        });


    }
}
