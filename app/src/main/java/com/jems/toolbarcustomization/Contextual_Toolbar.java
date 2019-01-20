package com.jems.toolbarcustomization;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Contextual_Toolbar extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual__toolbar);
        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("Contextual Menu");
        toolbar.setSubtitle("By Alif");
    }

    public void contextualMenuOpen(View view) {
        actionMode = Contextual_Toolbar.this.startActionMode(new ContextualCallBack());
    }

    class ContextualCallBack implements ActionMode.Callback {

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {

            //inflate the menu layout
            mode.getMenuInflater().inflate(R.menu.menu_overflow, menu);

            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {

            //after the menu layout is inflated then set the title and subtitle
            mode.setTitle("My Action Mode");
            mode.setSubtitle("By Alif");

            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

            //add funtionality to the menu item
            CharSequence title = item.getTitle();
            switch (item.getItemId()) {
                case R.id.mSave:
                    //toolbar.setTitle(title);
                    Toast.makeText(Contextual_Toolbar.this, title + "", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.mCamera:
                    //toolbar.setTitle(title);
                    Toast.makeText(Contextual_Toolbar.this, title + "", Toast.LENGTH_SHORT).show();
                    return true;

                default:
                    return false;
            }

        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

            //When action mode is ccmpleted then this method is calls
        }
    }
}
