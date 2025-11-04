package jobsheet9;
import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nAkhir[]= new int[10];

        for(int i=0; i<10; i++){
            System.out.print("masukkan nilai akhir ke "+i+": ");
            nAkhir[i]=scanner.nextInt();
        }

        for(int i=0; i<10; i++){
            System.out.println("nilai akhir mahasiswa ke-"+i+"adalah "+nAkhir[i]);
        }


        scanner.close();
    }
}
