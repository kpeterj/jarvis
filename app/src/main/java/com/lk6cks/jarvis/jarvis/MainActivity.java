package com.lk6cks.jarvis.jarvis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView list;
    private EditText edit;
    private MessageAdapter adapter;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        edit = (EditText) findViewById(R.id.editText);
        adapter = new MessageAdapter(this,new ArrayList<String>());
        button= (Button) findViewById(R.id.gomb);
        adapter.add(getString(R.string.app_name));
        list.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sz=edit.getText().toString();
                adapter.add(sz);
                edit.setText("");
                respond(sz);
            }
        });


    }

    private void respond(String sz) {
        adapter.add(sz);
    }


}
