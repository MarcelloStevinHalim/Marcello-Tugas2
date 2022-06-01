package Ruangruang;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in) ;

        System.out.println("Volume Kerucut");
        Kerucut kerucut = new Kerucut();
        
        System.out.print("Input (cm) jari-jari kerucut : "); 
        kerucut.r = keyboard.nextInt() ;

        System.out.print("Input (cm) tinggi kerucut : ") ;
        kerucut.t = keyboard.nextInt() ;
        

        kerucut.printVolumeKerucut();
        kerucut.hitungVolumeKerucut();
       
    }
}
