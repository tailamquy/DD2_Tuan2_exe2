package com.example.lamtran.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class SingleTouchActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TouchEventView(this, null));
    }
}
