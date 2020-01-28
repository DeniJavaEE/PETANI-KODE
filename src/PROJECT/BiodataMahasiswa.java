
package PROJECT;

import java.util.Scanner;
public class BiodataMahasiswa {
    public static void main(String[] args)
    {   
            // DEKLARASI VARIABLE
        
            String  nama;
            String  kelas;
           
            
            // input secara manual dengan scanner 
            
            Scanner masukan_data = new Scanner(System.in);
            
            // nama 
            
            System.out.print("NAMA = ");
            nama=masukan_data.nextLine();
            
            // kelas
            
            System.out.print("kelas = ");
            kelas=masukan_data.nextLine();
            
            
            // cetak 
            
     //   System.out.println("Nama " + nama);
     //   System.out.println("kelas " + kelas);
     
     System.out.println(" Selamat datang " + nama + " sekarang anda berada di kelas " + kelas);
    }
}
