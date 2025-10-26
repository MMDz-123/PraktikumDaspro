package jobsheet7;
import java.util.Scanner;


public class tugas1_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int jml, aft=0, i=1, tot, fin=0, hrg=50000;
        double dsc=0;
        
      do{
        System.out.print("masukkan jumlah tiket yang dibeli oleh pelanggan ke-"+i+":");
        jml=scanner.nextInt();
        tot=hrg*jml;
            if(jml==0){
                System.out.println("=====================================");
                System.out.println("Input selesai");
                break;
            }
            else if(jml<0){
                System.out.println("Jumlah tidak valid, periksa lagi jumlah yang diinput");
            }
            else{
                if(jml>=4){
                    dsc=1.0/10;
                }
                else if(jml>=10){
                    dsc=3.0/20;
                }
                else if(jml>0){
                    dsc=0;
                }
                aft=(int) (tot-(tot*dsc));
                fin+=aft;

                System.out.println("Harga pelanggan ke-"+i+": "+aft);
                i++;
            }
        }
        while(true);
        System.out.println("total "+ fin);
        scanner.close();
    }}
    