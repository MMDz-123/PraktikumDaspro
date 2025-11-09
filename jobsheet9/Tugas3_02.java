package jobsheet9;
import java.util.Scanner;

public class Tugas3_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        
        String menu[]= {"Nasi goreng", "Mie goreng", "Roti bakar", "Pisang goreng", "Kentang goreng",
        "Kopi hitam", "Teh tarik", "Es cokelat", "Cappucino", "abc"};
        String key;

        int hrg[]={15000, 10000, 20000, 7500, 6700, 3500, 5000, 5000, 7500, 67};

        
        System.out.print("Cari menu: ");
        key=scanner.nextLine().replace(" ", "");
        System.out.println();
        for(int i=0; i<menu.length; i++){
            if(key.equalsIgnoreCase(menu[i].replace(" ", ""))){
                System.out.println("Menu ditemukan, Harga: "+hrg[i]);
                break;
            }
            else if(i==menu.length-1){
            System.out.println("Menu tidak ditemukan");
            System.out.println();
            }
        }               
        scanner.close();
    }
}

