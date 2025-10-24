package jobsheet7;
import java.util.Scanner;

public class KafeDoWhile2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int kopi, teh, roti, hargaKopi=12000, hargaTeh=7000, hargaRoti=20000;
        String namaPelanggan;
        do{
        System.out.println("Masukkan nama pelanggan(ketik batal untuk keluar)");
        namaPelanggan=scanner.next();
            if(namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi batal");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi=scanner.nextInt();
            System.out.println("jumlah teh: ");
            teh=scanner.nextInt();
            System.out.println("Jumlah roti: ");
            roti=scanner.nextInt();

            int totHrg= (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("total harga yang dibayar: Rp "+totHrg);
            scanner.nextLine();

        }
        while(true);
        System.out.println("Transaksi selesai");
        scanner.close();
    }
}