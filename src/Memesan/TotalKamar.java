package Memesan;

import java.util.Scanner;

public class TotalKamar extends TipeKamar {
    int lamainap;
    int JumlahKamarSaatIni = 100;
    Scanner input = new Scanner(System.in);

    public void lamainap (int lamainap ){
    this.lamainap =lamainap;
     System.out.println("Lama Menginap : " + lamainap);
    }

    public void JumlahKamar(int jumlahKamar){
        if (jumlahKamar > 100){
            System.out.println("Jumlah Kamar tidak cukup");
            return;
        }
        this.JumlahKamar = jumlahKamar;
        JumlahKamarSaatIni = JumlahKamarSaatIni - jumlahKamar;
        Notif();
        
    }

    public void NotifKamar() {
        System.out.println("Jumlah Kamar yang tersedia saat ini : " + JumlahKamarSaatIni);
    }

    public void Notif() {
        System.out.println("Terimakasih telah memesan kamar di Hotel kami");
        System.out.println("Silahkan menunggu konfirmasi dari kami");
    }
    
}
