package jobsheet9;
import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang diinput: ");
        int n= scanner.nextInt();
        int arrNilai[]=new int[n];
        int key;
        int hasil=0;

        for(int i=0; i<arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            arrNilai[i]=scanner.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key= scanner.nextInt();
        
        for(int i=0; i<arrNilai.length; i++){
            if(key==arrNilai[i]){
                hasil=i;
                System.out.println();
                System.out.println("Nilai "+key+" nilai mahasiswa ke-"+hasil);
                System.out.println();
                break;
            }
                if(i==arrNilai.length-1){
                System.out.println();
                System.out.println("nilai tidak ditemukan");
                System.out.println();
                break;
            }
        scanner.close();
        }
    }
}
