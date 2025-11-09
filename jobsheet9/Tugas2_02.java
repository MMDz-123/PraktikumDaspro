package jobsheet9;
import java.util.Scanner;

public class Tugas2_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int tot=0, jml=0;
        
        System.out.print("Masukkan jumlah makanan yang dipesan: ");
        jml= scanner.nextInt();
        String[] menu= new String[jml];
        int[] hrg= new int[jml];

        for (int i=0; i<jml; i++){
            System.out.print("Pesanan ke- "+(i+1)+":");
            menu[i]= scanner.next();
            System.out.print("Harga: ");
            hrg[i]=scanner.nextInt();
            tot+=hrg[i];
        }
        System.out.println("=============================");
        for(int i=0; i<jml; i++){
            System.out.print(menu[i]);
            System.out.println("\t"+hrg[i]);
        }
        System.out.println("Total Harga: "+tot);

        scanner.close();
    }
}
