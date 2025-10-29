package jobsheet8;
import java.util.Scanner;;

public class Square2 {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan nilai n= ");
        int n=scanner.nextInt();

        for(int iOut=1; iOut<=n; iOut++){
            for(int i=1; i<=n; i++){
            System.out.print("*");;
            }
            System.out.println();
        }


     scanner.close();
    }
}
