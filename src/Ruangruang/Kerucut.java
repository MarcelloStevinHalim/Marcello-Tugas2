package Ruangruang;
public class Kerucut {
    //atribut
    public final float PI = 22.0f/7 ; 
    public int r = 0;
    public int t = 0;
    public float volume = 0; 

    // method hitung volume kerucut
        public void hitungVolumeKerucut () {
        volume =  PI * r * r * t / 3 ; 
    }

    //tampilkan volume kerucut 
    public void printVolumeKerucut () {
        hitungVolumeKerucut();
        System.out.println("Volume Kerucut = "+ volume + "cm3");
        
    }
}