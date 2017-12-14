package com.alllocationconceptbygoogle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alllocationconceptbygoogle.basiclocation.BasicLocationActivity;
import com.alllocationconceptbygoogle.locationaddress.LocationAddressActivity;
import com.alllocationconceptbygoogle.locationupdatesforegroundservice.LocationServiceForegroundActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBasicLocation,btnLocationAddress,btnLocationServiceForeground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnBasicLocation = (Button) findViewById(R.id.btnBasicLocation);
        btnLocationAddress = (Button) findViewById(R.id.btnLocationAddress);
        btnLocationServiceForeground = (Button) findViewById(R.id.btnLocationServiceForeground);

        btnBasicLocation.setOnClickListener(this);
        btnLocationAddress.setOnClickListener(this);
        btnLocationServiceForeground.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;
        switch (id) {
            case R.id.btnBasicLocation:
                intent = new Intent(MainActivity.this, BasicLocationActivity.class);
                break;
            case R.id.btnLocationAddress:
                intent = new Intent(MainActivity.this, LocationAddressActivity.class);
                break;
            case R.id.btnLocationServiceForeground:
                intent = new Intent(MainActivity.this, LocationServiceForegroundActivity.class);
                break;
            default:

        }
        if(intent != null)
            startActivity(intent);
    }
}
