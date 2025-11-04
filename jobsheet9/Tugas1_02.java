package jobsheet9;
import java.util.Scanner;

public class Tugas1_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int jml, tot=0;
        double rata, ntg=0, nrd=100;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml= scanner.nextInt();
        int nilai[]= new int[jml];

        for(int i=0; i<nilai.length; i++){
            System.out.print("Masukkan nilai mahasigma ke-"+(i+1)+" ");
            nilai[i]=scanner.nextInt();
            tot+= nilai[i];
            rata= tot/nilai.length;
            if(nilai[i]>ntg){
                ntg=nilai[i];
            }
            if(nilai[i]<nrd){
                nrd=nilai[i];
            }
        }

        rata= tot/nilai.length;
        System.out.println("======================================");
        for(int i=0; i<nilai.length; i++){
            System.out.println("nilai mahasiswa ke-"+i+" = "+nilai[i]);
        }
        System.out.println();
        System.out.println("rata-rata adalah "+ rata);
        System.out.println("nilai tertinggi= "+ ntg);
        System.out.println("nilai terendah="+ nrd);


        scanner.close();
    }
}
