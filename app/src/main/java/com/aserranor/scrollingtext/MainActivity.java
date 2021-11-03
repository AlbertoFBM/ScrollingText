package com.aserranor.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void addComments(View v){
        Button b1 = (Button) findViewById(R.id.addComment);
        TextView t1 = (TextView) findViewById(R.id.comment);
        EditText e1 = (EditText) findViewById(R.id.editComment);

        b1.setText("SEND");
        e1.setVisibility(v.VISIBLE);
        if(b1.getText()== "SEND"){

            String content = e1.getText().toString();
            String comentarioAnterior = t1.getText().toString();
            t1.setText(comentarioAnterior);
            t1.setText(comentarioAnterior +"\nComentario: "+ content +"\n");


        }else{
            e1.setVisibility(v.INVISIBLE);
        }

    }














    /**
     *
     * public void addComment(View view){
     *         Button b = (Button) findViewById(R.id.addComment);
     *         EditText e = (EditText) findViewById(R.id.editComment);
     *         TextView t = (TextView) findViewById(R.id.article_text);
     *         b.setText("Send");
     *         e.setVisibility(view.VISIBLE);
     *         if(b.getText() == "Send"){
     *             b.setOnClickListener(new View.OnClickListener() {
     *                 @Override
     *                 public void onClick(View view) {
     *                     String textoAnterior = t.getText().toString();
     *                     t.setText(textoAnterior + e.getText());
     *                 }
     *             });
     *             b.setText("Send comment");
     *         }else{
     *             e.setVisibility(view.GONE);
     *         }
     *
     *     }
     */

}