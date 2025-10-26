package jobsheet7;
import java.util.Scanner;

public class Tugas2_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int jns, dur, tot=0;

        do{        
        System.out.print("Masukkan jenis kendaraan(1 Mobil, 2 Motor, 0 Keluar)");
        jns=scanner.nextInt();
            if(jns==0){
                break;
            }
            else if(jns>2||jns<0){
                System.out.println("Jenis tidak valid");
                continue;
            }

            System.out.print("Durasi: ");
            dur=scanner.nextInt();

            if(dur>5){
                tot+=12500;
            }
            else if(jns==1){
                tot+=dur*3000;
            }
            else if(jns==2){
                tot+=dur*2000;
            }
        }
        while(true);
        System.out.println("=================");
        System.out.println("Total biaya: Rp "+tot);
        scanner.close();
    }
}
