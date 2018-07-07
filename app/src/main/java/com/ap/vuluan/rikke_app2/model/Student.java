package com.ap.vuluan.rikke_app2.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Student implements Parcelable{

    private String Name;
    private String QueQuan;
    private int NamSinh;
    private String GioiTinh;
    private String Lop;
    private String KhoaHoc;


    public Student(String name, String queQuan, int namSinh, String gioiTinh, String lop, String khoaHoc) {
        Name = name;
        QueQuan = queQuan;
        NamSinh = namSinh;
        GioiTinh = gioiTinh;
        Lop = lop;
        KhoaHoc = khoaHoc;
    }

    protected Student(Parcel in) {
        Name = in.readString();
        QueQuan = in.readString();
        NamSinh = in.readInt();
        GioiTinh = in.readString();
        Lop = in.readString();
        KhoaHoc = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);



        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        KhoaHoc = khoaHoc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(QueQuan);
        dest.writeInt(NamSinh);
        dest.writeString(GioiTinh);
        dest.writeString(Lop);
        dest.writeString(KhoaHoc);
    }
}
