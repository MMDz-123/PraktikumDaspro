package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double rata, ratatdk , totLls=0, totdklls=0;
        int jml=0, jmlLLs=0, jmltdk=0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml= scanner.nextInt();
        int nilaiMhs[]= new int[jml];

        for(int i=0; i<nilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke-"+i+": ");
            nilaiMhs[i]= scanner.nextInt();
            if(nilaiMhs[i]>70){
                jmlLLs++;
                totLls += nilaiMhs[i];
            }
            else{
                jmltdk++;
                totdklls+=nilaiMhs[i];
            }
        }

        rata= totLls/jmlLLs;
        ratatdk=totdklls/jmltdk;
        
        System.out.println("Rata2 nilai mahasiswa lulus = "+rata);
        System.out.println("Rata2 nilai mahasiswa tidak lulus = "+ratatdk);

        scanner.close();
    }
}
