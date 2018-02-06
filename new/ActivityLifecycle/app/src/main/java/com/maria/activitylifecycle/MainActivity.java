package com.maria.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate");
        Toast.makeText(getApplication(),"onCreate",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart");
        Toast.makeText(getApplication(),"onStart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume");
        Toast.makeText(getApplication(),"onResume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause");
        Toast.makeText(getApplication(),"onPause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop");
        Toast.makeText(getApplication(),"onStop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart");
        Toast.makeText(getApplication(),"onRestart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy");
        Toast.makeText(getApplication(),"onDestroy",Toast.LENGTH_SHORT).show();
    }
}
