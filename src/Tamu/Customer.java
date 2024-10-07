package Tamu;

import Memesan.*;
import java.util.Scanner;

public class Customer implements data {
    DataPemesan data = new DataPemesan();
    public String nama;
    public String email;
    public String phone;

    Scanner input = new Scanner(System.in);
    DataPemesan pemesan = new DataPemesan();
    TipeKamar tipe = new TipeKamar();
    TotalKamar total = new TotalKamar();

    public Customer(String nama, String email, String phone) {
        this.nama = nama;
        this.email = email;
        this.phone = phone;

        Scanner input = new Scanner(System.in);
        pemesan.setData(nama, email, phone);
        System.out.println("Pilih tipe kamar: ");
        System.out.println("1. Kamar Standard");
        System.out.println("2. Kamar Superior");
        System.out.println("3. Kamar Deluxe");
        System.out.println("4. Kamar Suite");
        System.out.print("Pilih tipe kamar: ");
        int pilihan = input.nextInt();
        tipe.pilihKamar(pilihan);

        System.out.print("Lama menginap: ");
        int lamainap = input.nextInt();
        total.lamainap(lamainap);

        System.out.print("Jumlah kamar: ");
        int jumlahKamar = input.nextInt();
        total.JumlahKamar(jumlahKamar);


        
    }

    public void notifikasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
    


}
