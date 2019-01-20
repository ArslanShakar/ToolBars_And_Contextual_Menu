package com.jems.toolbarcustomization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void standaloneToolbar(View view) {
        startActivity(new Intent(this, Standalone_Toolbar.class));
    }

    public void toolbarAsActionBar(View view) {
        startActivity(new Intent(this, Toolbar_As_Actionbar.class));
    }

    public void contextualMenu(View view) {
        startActivity(new Intent(this, Contextual_Toolbar.class));
    }
}
