package isc;
import java.lang.Math;
public class Day82 {
    public static void main(String[] args) {
    double number = 5.75;
        System.out.println("Angka asli: " + number);
          // Menggunakan ceil
        System.out.println("Hasil ceil: " + Math.ceil(number)); // Membulatkan ke atas
        // Menggunakan floor
        System.out.println("Hasil floor: " + Math.floor(number)); // Membulatkan ke bawah
        // Menggunakan round
        System.out.println("Hasil round: " + Math.round(number)); // Membulatkan ke nilai terdekat
}   
}
