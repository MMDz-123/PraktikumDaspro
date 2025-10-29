package jobsheet5;
import java.util.Scanner;

public class CM1_AhmadAdrian {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("=======INPUT NAMA MAHASISWA=======");
        System.out.print("Masukkan nama \t: \t");
        String nama= sc.next();
        sc.nextLine();
        System.out.print("Masukkan NIM \t: \t");
        long NIM= sc.nextLong();
        sc.nextLine();

        System.out.println("-----Mata Kuliah 1: Algoritma dan Pemrograman-----");
        System.out.print("Nilai UTS \t: \t");
        byte nUts1= sc.nextByte();
        System.out.print("Nilai UAS \t: \t");
        byte nUas1= sc.nextByte();
        System.out.print("Nilai tugas \t: \t");
        byte nTug1= sc.nextByte();

        System.out.println("-----Mata kuliah 2: Struktur Data-----");
        System.out.print("Nilai UTS \t: \t");
        byte nUts2= sc.nextByte();
        System.out.print("Nilai UAS \t: \t");
        byte nUas2= sc.nextByte();
        System.out.print("Nilai tugas \t: \t");
        byte nTug2= sc.nextByte();

        double nAkhirA= (nUts1*0.3)+(nUas1*0.4)+(nTug1*0.3);
        double nAkhirB= (nUts2*0.3)+(nUas2*0.4)+(nTug2*0.3);

        double nAkhir1= Math.round(nAkhirA*100.0)/100.0;
        double nAkhir2= Math.round(nAkhirB*100.0)/100.0;

        String nHrf1;
        
            if (nAkhir1<=100 && nAkhir1>80){           
                nHrf1= "A";                
            }
            else if (nAkhir1<=80 && nAkhir1>73){
                nHrf1= "B+";               
            }
            else if (nAkhir1<=73 && nAkhir1>65){
                nHrf1= "B";               
            }
            else if(nAkhir1<=65 && nAkhir1>60){
                nHrf1= "C+";              
            }
            else if(nAkhir1<=60 && nAkhir1>50){
                nHrf1= "C";                
            }
            else if(nAkhir1<=50 && nAkhir1>39){
                nHrf1= "D";                
            }    
            else{
                nHrf1="E";
            }
    
        String nHrf2;
            if (nAkhir2<=100 && nAkhir2>80){
                nHrf2= "A";
            }
            else if (nAkhir2<=80 && nAkhir2>73){
                nHrf2= "B+";               
            }
            else if (nAkhir2<=73 && nAkhir2>65){
                nHrf2= "B";               
            }
            else if(nAkhir2<=65 && nAkhir2>60){
                nHrf2= "C+";               
            }
            else if(nAkhir2<=60 && nAkhir2>50){
                nHrf2= "C";                
            }
            else if(nAkhir2<=50 && nAkhir2>39){
                nHrf2= "D";               
            }    
            else{
                nHrf2="E";              
            }

        String lulus1, lulus2;
        if (nAkhir1>=60){
            lulus1="LULUS";
        }
        else{
            lulus1= "TIDAK";
        }

        if (nAkhir2>=60){
            lulus2="LULUS";
        }
        else{
            lulus2= "TIDAK";
        }

        double rata= (nAkhir1+nAkhir2)/2;

        //tampilan pertama
        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama \t: \t"+ nama);
        System.out.println("NIM \t: \t"+ NIM);
        System.out.println("");
        System.out.println("Mata Kuliah \t \t \tUTS \tUAS \tTugas \tNilai Akhir \t Nilai Huruf \tSTATUS");
        System.out.println("============================================================================");
        System.out.println("Algoritma dan Pemrograman \t"+ nUts1 +"\t" + nUas1 + "\t" + nTug1 + "\t"+ nAkhir1+ "\t" + "\t" + "\t" + nHrf1 + "\t" + lulus1);
        System.out.println("Struktur Data \t \t \t"+ nUts2 +"\t" + nUas2 + "\t" + nTug2 + "\t"+ nAkhir2+ "\t" + "\t" + "\t" + nHrf2 + "\t" + lulus2);

        String lulSem;
        if(lulus1.equals("LULUS") && lulus2.equals("LULUS")){
            if(rata>=70){
                lulSem="LULUS";
            }
            else{
                lulSem="TIDAK LULUS, rata-rata < 70";
            }
        }
        else{
            lulSem="TIDAK LULUS, matkul ada yang tidak lulus";
        }

        System.out.println("RATA-RATA NILAI AKHIR: " + rata);
        System.out.println("Status semester: "+ lulSem);

        sc.close();
    }
}
