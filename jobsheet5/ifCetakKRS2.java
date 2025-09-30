package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("====== CETAK KRS SIAKAD ======");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        System.out.println();
        boolean isLunas= scanner.nextBoolean();

        if(isLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan minta TTD DPA masing-masing");
            System.out.println("====================================");
        }
       scanner.close();

    }
}