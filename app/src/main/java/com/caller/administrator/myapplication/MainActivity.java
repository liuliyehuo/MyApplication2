package com.caller.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void call(View v){
        System.out.println(getString(R.string.call1));
        //1，取出拨号框号码
        EditText etNumber = (EditText) findViewById(R.id.number);
        String number = etNumber.getText().toString();
        //2，拨打
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        startActivity(intent);
    }

}
