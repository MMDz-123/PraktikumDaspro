package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("====== CETAK KRS SIAKAD ======");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        System.out.println();
        boolean isLunas= scanner.nextBoolean();
        String pesan= (isLunas)? "Pembayaran UKT terverifikasi"+"\nSilahkan minta TTD DPA masing-masing": "Registrasi ditolak, Silahkan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
        
       scanner.close();

    }
}