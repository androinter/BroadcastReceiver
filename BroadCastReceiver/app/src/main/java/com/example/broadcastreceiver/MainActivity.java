package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_brocast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_brocast =  findViewById(R.id.btn_brocast);

        btn_brocast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setAction("com.example.broadcastreceiver.ICLaucher");
                sendBroadcast(intent);
            }
        });
    }
}