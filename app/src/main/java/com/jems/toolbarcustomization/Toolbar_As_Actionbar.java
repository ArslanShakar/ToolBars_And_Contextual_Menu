package com.jems.toolbarcustomization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Toolbar_As_Actionbar extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView tvToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_as_actionbar);

        toolbar = findViewById(R.id.toolbar_as_actionbar);
        /*
        toolbar.setTitle("Toolbar As Actionbar");
        toolbar.setSubtitle("by Alif");
        */

        //OR
        tvToolbarTitle = toolbar.findViewById(R.id.tv_toolbar_title);
        tvToolbarTitle.setText("ToolBar As ActionBar");

        setSupportActionBar(toolbar);

        //hide the tool bar title
        getSupportActionBar().setDisplayShowTitleEnabled(false); //toolbar.setTitle("Toolbar As Actionbar"); that will be hides

        //navigation back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*
        //OR
         getSupportActionBar().setTitle("Actionbar");
         getSupportActionBar().setSubtitle("By Alif");
        * */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_overflow, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            //action bar back button/arrow clicked event/action
            case android.R.id.home:
                onBackPressed();
                return true;

                default:
                    return false;
        }
    }
}
