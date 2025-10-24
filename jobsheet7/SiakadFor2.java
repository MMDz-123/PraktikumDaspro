package jobsheet7;
import java.util.Scanner;

public class SiakadFor2 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        
        double nilai, trtinggi=0, trrendah=100;
        int i, o=0;
        int lls;
        
        for(i=1; i<=10; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+i);
            nilai= sca.nextDouble();
            if(nilai>trtinggi){
                trtinggi=nilai;
            }
            if(nilai<trrendah){
                trrendah=nilai;
            }
            if(nilai<60){
                o++;
            }
        }
        lls=10-o;
        System.out.println("Nilai tertinggi="+trtinggi);
        System.out.println("Nilai terendah="+trrendah);
        System.out.println("Mahasiswa yang tidak lulus="+o);
        System.out.println("Mahasiswa yang lulus="+lls);

        
        sca.close();
    }
}
