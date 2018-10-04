package com.example.anthony.soillauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Attempts to launch an activity within our own app
        Button LoginBtn = (Button)findViewById(R.id.LoginBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),LoginActivity.class);
                startIntent.putExtra("com.example.anthony.soillauncher","Hello World");
                startActivity(startIntent);
            }
        });
        //Attempt to launch an activity outside our app
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.soilcares.com/en/community-hubs/africa/";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager())!= null){
                    startActivity(gotoGoogle);
                };
            }
        });
        Button thirdActivityBtn = (Button)findViewById(R.id.thirdActivityBtn);
        thirdActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),Main2Activity.class);
                startIntent.putExtra("com.example.anthony.soillauncher","Hello World");
                startActivity(startIntent);
            }
        });

    }
}
