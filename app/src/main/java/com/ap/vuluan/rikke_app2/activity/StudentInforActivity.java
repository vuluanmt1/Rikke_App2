package com.ap.vuluan.rikke_app2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ap.vuluan.rikke_app2.R;
import com.ap.vuluan.rikke_app2.model.Student;

public class StudentInforActivity extends AppCompatActivity {

    TextView txt_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);

        txt_View=(TextView)findViewById(R.id.txtStudenInfor);


        Bundle bundle = getIntent().getExtras();


        if(bundle !=null){


//            String name = bundle.getString("name");
//            String diachi = bundle.getString("diachi");
//            int namsinh =bundle.getInt("namsinh");
//            String gioitinh = bundle.getString("gioitinh");
//            String lop = bundle.getString("lop");
//            String khoahoc =bundle.getString("khoahoc");

            Student student =bundle.getParcelable("student");





            txt_View.setText(student.getName()+"\n"+student.getQueQuan()+"\n"+
                             student.getNamSinh()+"\n"+student.isGioiTinh()+"\n"+
                             student.getKhoaHoc()+"\n"+student.getLop());

        }



    }
}
