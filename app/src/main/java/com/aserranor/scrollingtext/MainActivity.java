package com.aserranor.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.addComment);
        TextView t1 = (TextView) findViewById(R.id.comment);
        EditText e1 = (EditText) findViewById(R.id.editComment);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getVisibility() == View.VISIBLE){
                    e1.setVisibility(View.INVISIBLE);
                }else {
                    e1.setVisibility(View.VISIBLE);
                }

                String content = e1.getText().toString();
                t1.setText(content);
            }

        });
    }
}