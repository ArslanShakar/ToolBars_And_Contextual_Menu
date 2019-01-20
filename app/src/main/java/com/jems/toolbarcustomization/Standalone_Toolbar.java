package com.jems.toolbarcustomization;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class Standalone_Toolbar extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone_toolbar);

        setToolbar();

    }

    private void setToolbar() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Standalone Toolbar");
        toolbar.setSubtitle("by Arslan");
        toolbar.setNavigationIcon(R.drawable.ic_nav);

        toolbar.inflateMenu(R.menu.menu_overflow);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                CharSequence title = menuItem.getTitle();
                switch (menuItem.getItemId()) {
                    case R.id.mSave:
                        toolbar.setTitle(title);
                        return true;
                    case R.id.mCamera:
                        toolbar.setTitle(title);
                        Toast.makeText(Standalone_Toolbar.this, title + "", Toast.LENGTH_SHORT).show();
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    //when on toolbar navigation button clicked

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
