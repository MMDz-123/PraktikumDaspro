package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS2 {

    public static void main(String[] args) {
        /* 
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
*/
    Scanner sc= new Scanner(System.in);
    /* 
    int angka;
    System.out.print("Masukkan angka, bebas: ");
    angka= sc.nextInt();

    if(angka%2 == 0){
        System.out.println(angka+ " adalah bilangan genap");
    }
    else{
        System.out.println(angka+ " adalah bilangan ganjil");
    }
    */
    String user;
    int SKS;

    System.out.print("Sebagai apakah Anda? ");
    user= sc.nextLine().toLowerCase();

    if(user.equals("dosen")){
        System.out.println("Akses diterima (Dosen)");
    }
    else if(user.equals("mahasiswa")){
        System.out.print("Masukkan jumlah SKS yang diambil: ");
        SKS= sc.nextInt();
        if(SKS>=12){
            System.out.println("Akses diterima (Mahasiswa aktif)");
        }
        else{
            System.out.println("Akses ditolak, SKS kurang dari 12");
        }
    }
    else{
        System.out.println("Akses ditolak, bukan CA Polinema");
    }
    
    sc.close();
    }
}