package isc;
import java.util.Scanner;
public class Day39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Operator penugasan : modulus ");
        System.out.println("masukkan nilai pertama");
        int a = input.nextInt();
        System.out.println("masukkan nilai kedua");
        int b = input.nextInt();
        System.out.print("hasil modulus dari variabel a dan b adalah: ");
        a %= b;
        System.out.println(a);
}
}
