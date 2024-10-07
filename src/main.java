import java.util.Scanner;
import Tamu.*;
import Memesan.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================Hotel Isekai====================");
        System.out.println("1. Admin");
        System.out.println("2. Pemesan");
        System.out.print("Pilih : ");

        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("Username : ");
                String username = input.nextLine();
                System.out.print("Password : ");
                String password = input.nextLine();
                if (!username.equals("admin") || !password.equals("admin")) {
                    System.out.println("Username atau password salah");
                    return;
                }
                System.out.println("Login berhasil");
                System.out.println("1. Tambah data pemesan:");
                System.out.println("2. Lihat data tamu:");
                System.out.println("3. Data kamar:");
                System.out.print("Pilih : ");
                int pilihAdmin = input.nextInt();
                input.nextLine();
                switch (pilihAdmin) {
                    case 1:
                        System.out.println("Tambah data pemesan: ");
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Email: ");
                        String email = input.nextLine();
                        System.out.print("Phone: ");
                        String phone = input.nextLine();
                        Customer customer = new Customer(nama, email, phone);
                        break;
                    case 2:
                        System.out.println("Data tamu: ");
                        DataPemesan data = new DataPemesan();
                        data.printData();
                        break;
                    case 3:
                        System.out.println("Data kamar: ");
                        TotalKamar totalKamar = new TotalKamar();
                        totalKamar.NotifKamar();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case 2:
                System.out.println("1. Lihat kamar");
                System.out.println("2. Pesan kamar");
                System.out.print("Pilih: ");
                int pilihPemesan = input.nextInt();
                input.nextLine();
                switch (pilihPemesan) {
                    case 1:
                        System.out.println("Lihat kamar");
                        System.out.println("1. Kamar Standard");
                        System.out.println("2. Kamar Superior");
                        System.out.println("3. Kamar Deluxe");
                        System.out.println("4. Kamar Suite");
                        break;
                    case 2:
                        System.out.println("Tambah data pemesan: ");
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Email: ");
                        String email = input.nextLine();
                        System.out.print("Phone: ");
                        String phone = input.nextLine();
                        Customer cos = new Customer(nama, email, phone);
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                        break;
                }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
        input.close();
    }
}
