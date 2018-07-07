package com.ap.vuluan.rikke_app2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ap.vuluan.rikke_app2.R;

public class MainActivity extends AppCompatActivity {

    private EditText edit_TextData;
    private Button btn_SendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit_TextData = (EditText)findViewById(R.id.edtName);
        btn_SendData =(Button)findViewById(R.id.btnSend);


        btn_SendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent =  new Intent(MainActivity.this, StudentActivity.class );
                intent.putExtra("data",edit_TextData.getText().toString());
                startActivity(intent);

            }
        });


    }
}
