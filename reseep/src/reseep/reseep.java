/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class reseep {
String rincianSatu;
String rincianDua;
String rincianTiga;
String rincianEmpat;



void rincian (String baba){
    rincianSatu=baba;
    rincianDua=baba;
    rincianTiga=baba;
    rincianEmpat=baba;
    
    Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        //int hargatotal = 0;
        //int penampung = 0;
        String resep[] = new String [100];
        //int harga[] = new int [100];
        String keputusan="Y";

        System.out.println("Daftar Resep Makanan ");
        System.out.println("----------------------------- ");
        System.out.println("1. Telur dadar          ");
        System.out.println("2. Roti bakar  ");
        System.out.println("3. Indomie    ");
        System.out.println("4. Nasi goreng          ");
        while (keputusan.equals("Y")||keputusan.equals("y"))
        {
        System.out.print("Pilihan Resep anda  = ");
        int pil = input.nextInt();
        if (pil==1){
            resep[i] = rincianSatu  ;
            
        } else if (pil==2) {
            resep[i]= rincianDua;
            
        } else if (pil==3) {
            resep[i]=rincianTiga;
            
        } else if (pil==4) {
            resep[i]= rincianEmpat;
            
        } else {
            System.out.println("Maaf pilihan Resep anda tidak tepat ");
            resep[i]= "Tidak Ada";
        }
            System.out.println("Resep yang anda pilih adalah          : "+resep[i]);
            System.out.print("Apakah anda ingin memilih lagi ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Resep yang anda pilih adalah          : "+i);
        for (int a = 0; a<i;a++){
            System.out.print(resep[a]+", ");
        }
        System.out.println("Resepnya adalah   : "+resep);
    }
}
    