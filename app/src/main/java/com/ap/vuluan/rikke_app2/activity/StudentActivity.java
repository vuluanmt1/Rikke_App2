package com.ap.vuluan.rikke_app2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ap.vuluan.rikke_app2.R;
import com.ap.vuluan.rikke_app2.model.Student;

public class StudentActivity extends AppCompatActivity {

    TextView txt_Name;
    EditText edt_QueQuan, edt_NamSinh, edt_GioiTinh,edt_Lop, edt_KhoaHoc;

    Button btn_ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

            AnhXa();


            Intent intent= getIntent();
            final String name =intent.getStringExtra("data");
            txt_Name.setText(name);

            btn_ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent= new Intent(StudentActivity.this,StudentInforActivity.class);

                      intent.putExtra("student", new Student(txt_Name.getText().toString(),
                              edt_QueQuan.getText().toString(),
                              Integer.parseInt(edt_NamSinh.getText().toString()),
                              edt_GioiTinh.getText().toString(),
                              edt_Lop.getText().toString(),
                              edt_KhoaHoc.getText().toString()));

                               startActivity(intent);
                        }
            });

    }

    private void AnhXa() {
        txt_Name =(TextView)findViewById(R.id.txtName);
        edt_QueQuan =(EditText)findViewById(R.id.edtQueQuan);
        edt_NamSinh =(EditText)findViewById(R.id.edtNamSinh);
        edt_GioiTinh =(EditText)findViewById(R.id.edtGioiTinh);
        edt_Lop =(EditText)findViewById(R.id.edtLop);
        edt_KhoaHoc =(EditText) findViewById(R.id.edtKhoaHoc);
        btn_ok =(Button)findViewById(R.id.btnXem);


    }

}
