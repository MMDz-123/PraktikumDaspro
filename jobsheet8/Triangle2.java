package jobsheet8;
import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n=");
        n=scanner.nextInt();
        int i=0;
        int j=0;

        while(i<=n){
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
        }

        scanner.close();
    }

}
