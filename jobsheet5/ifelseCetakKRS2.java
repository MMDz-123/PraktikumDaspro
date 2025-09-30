package jobsheet5;
import java.util.Scanner;

public class ifelseCetakKRS2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("=====CETAK KRS SIAKAD=====");
        System.out.print("Masukkan semester saat ini: ");
        int smt= sc.nextInt();

        if(smt==1){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==2){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==3){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==4){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==5){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==6){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==7){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else if(smt==8){
            System.out.println("KRS semester "+ smt + " ditampilkan");
        }
        else{
            System.out.println("Tidak valid");
        }


        sc.close();
    }
    
}
