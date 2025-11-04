package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nilaiMhs[]= new int[10];
        double rata, tot=0;

        for(int i=0; i<nilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke-"+i+": ");
            nilaiMhs[i]= scanner.nextInt();
        }

        for(int i=0; i<nilaiMhs.length; i++){
            tot += nilaiMhs[i];
        }

        rata= tot/nilaiMhs.length;
        System.out.println("Rata2 nilai mahasiswa = "+rata);

        scanner.close();
    }
}
