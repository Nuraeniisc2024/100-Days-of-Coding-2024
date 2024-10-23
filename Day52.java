package isc;
import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int angka =input.nextInt();
        int a = 0;
        a = (angka == 10) ? (angka+angka) : (angka/2);
        System.out.print("Hasil :" + a);
    }
}
