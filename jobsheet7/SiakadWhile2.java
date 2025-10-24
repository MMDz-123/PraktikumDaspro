package jobsheet7;
import java.util.Scanner;

public class SiakadWhile2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nilai, jumlah, i=1;

        System.out.println("Masukkan jumlah siswa");
        jumlah= scanner.nextInt();
        while((jumlah)+1>i){
            System.out.println("masukkan nilai mahasiswa ke-"+i);
            nilai=scanner.nextInt();
            if(nilai<0||nilai>100){
                System.out.println("nilai tidak valid");
                continue;
            }
            if(nilai>80&&nilai<=100){
                System.out.println("nilai mahasiswa ke-"+(i)+"adalah A");
                System.out.println("Bagus!!!!!!! pertahankan nilainya!!");
            }
            else if(nilai>73&&nilai<=80){
                System.out.println("niali mahasiswa ke-"+(i)+"adalah B+");
            }
            else if(nilai>65&&nilai<=73){
                System.out.println("nilai mahasiswa ke-"+(i)+"adalah B");
            }
            else if(nilai>60&&nilai<=65){
                System.out.println("nilai mahasiswa ke-"+(i)+"adalah C+");
            }
            else if(nilai>50&&nilai<=60){
                System.out.println("nilai mahasiswa ke-"+(i)+"adalah C");
            }
            else if(nilai>39&&nilai<=50){
                System.out.println("nilai mahasiswa ke-"+(i)+"adalah D");
            }
            else{
                System.out.println("nilai mahasiswa ke-"+(i)+"adalah E");
            }
            i++;
        }
            scanner.close();
        }
    }
