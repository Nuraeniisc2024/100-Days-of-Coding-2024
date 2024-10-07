package isc;
import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Operator penugasan : perkalian ");
        System.out.println("masukkan nilai pertama");
        int a = input.nextInt();
        System.out.println("masukkan nilai kedua");
        int b = input.nextInt();
        System.out.print("hasil perkalian dari variabel a dan b adalah: ");
        int c = a *= b;
        System.out.println(c);

        System.out.println("Operator penugasan : pembagian");
        System.out.println("masukkan nilai pertama");
        int ab = input.nextInt();
        System.out.println("masukkan nilai kedua");
        int ac = input.nextInt();
        System.out.print("hasil pembagian dari variabel ab dan ac adalah: ");
        int d = ab /= ac;
        System.out.println(d);
    }
}
