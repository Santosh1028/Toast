package com.futech.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button byeDeafult, simpleToast, nestedToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byeDeafult=findViewById(R.id.bydefault);
        simpleToast=findViewById(R.id.sGravity);
        nestedToast=findViewById(R.id.nestedGravity);

        byeDeafult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "By Default Toast", Toast.LENGTH_SHORT).show();
            }
        });

        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(MainActivity.this,"Simple Toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });

        nestedToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(MainActivity.this,"Nested Toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM,100,0);
                toast.show();
            }
        });
    }
}