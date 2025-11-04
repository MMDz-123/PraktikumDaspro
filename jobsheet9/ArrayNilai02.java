package jobsheet9;
import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nAkhir[]= new int[10];

        for(int i=0; i<nAkhir.length; i++){
            System.out.print("masukkan nilai akhir ke "+i+": ");
            nAkhir[i]=scanner.nextInt();
        }

        for(int i=0; i<10; i++){
            if(nAkhir[i] >70){
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
            else{
                System.out.println("Mahasiswa ke-"+i+" tidak lulus");
            }
        }


        scanner.close();
    }
}
