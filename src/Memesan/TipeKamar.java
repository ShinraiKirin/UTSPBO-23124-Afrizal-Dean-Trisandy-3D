package Memesan;

import java.util.Scanner;

public class TipeKamar {
    Scanner input = new Scanner(System.in);
    int JumlahKamarSaatIni = 100;
    public int JumlahKamar;
    public int hari;
    String Jeniskamar;
    int totalKamar =100;

    public void pilihKamar(int jenisKamar) {
        if (jenisKamar  == 1) {
            Jeniskamar = "Kamar Single";
        } else if (jenisKamar == 2) {
            Jeniskamar = "Kamar double";
        } else if (jenisKamar == 3) {
            Jeniskamar = "Kamar Suite";
        } else {
            System.out.println("Tipe kamar tidak tersedia");
        }
    }
    

    public void notif() {
        System.out.println("jenis kamar yang dipesan: " + Jeniskamar);
        System.out.println("lama menginap: " + hari + "hari");
        System.out.println("jumlah kamar yang dipesan: " + JumlahKamar + " kamar");
    }

}
