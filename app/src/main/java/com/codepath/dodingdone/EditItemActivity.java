package com.codepath.dodingdone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private static int itemPos ;
    private static EditText etName;


    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etName= (EditText) findViewById(R.id.etEditItem);
        etName.setText(getIntent().getStringExtra("item"));
        itemPos = getIntent().getIntExtra("pos",0);
    }

    /**
     *
     * @param v
     */
    public void onSave(View v){
        // Prepare data intent
        Intent data = new Intent();
        // Pass relevant data back as a result
        data.putExtra("item", etName.getText().toString());
        data.putExtra("pos",itemPos);
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        // closes the activity and returns to first screen
        finish();

    }
}
