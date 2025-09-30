package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pesan;

        System.out.println("Apakah mahasiswa sudah bebas kompen? (yes/no)");
        String bebasKompen= sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan 1:");
        int bimbP1= sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan log 2: ");
        int bimbP2= sc.nextInt();

        if(bebasKompen.equalsIgnoreCase("yes")){
            if(bimbP1 >=8 && bimbP2 >=4){
                pesan= "Syarat terpenuhi! Mahasiswa diperbolehkan mendaftar ujian skripsi";
            }
            else if(bimbP2<4){
                pesan= "Gagal! log bimbingan 2 kurang dari 4";
            }
            else if(bimbP1<8){
                pesan= "Gagal! log bimbingan 1 kurang dari 8";
            }
            else{
                pesan= "Gagal! log bimbingan 1 kurang dari 8 dan log bimbingan 2 kurang dari 4";
            }
        }
        else{
            pesan= "Gagal! mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

        sc.close();
    }
}
