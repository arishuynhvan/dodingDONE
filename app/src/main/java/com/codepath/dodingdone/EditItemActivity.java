package com.codepath.dodingdone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EditItemActivity extends AppCompatActivity {
    /* @todo Populate edit form
     * @todo Send back results on save
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
    }

    public void onSave(View v){
        // closes the activity and returns to first screen
        this.finish();

    }
}
