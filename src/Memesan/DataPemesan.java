package Memesan;

import java.util.Scanner;

public class DataPemesan{
    public String nama;
    public String email;
    public String phone;
    public int hari;

    public void setData(String nama, String email, String phone) {
        this.nama = nama;
        this.email = email;
        this.phone = phone;
        printData();
    }

    public void printData() {
        if (nama == null || email == null || phone == null) {
            System.out.println("Data pemesan belum diisi");
            return;
        }
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

}

