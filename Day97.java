package isc;

import java.util.Scanner;

public class Day97 {

    // Method untuk memeriksa apakah suatu bilangan adalah bilangan prima
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Bilangan kurang dari atau sama dengan 1 bukan bilangan prima
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Jika ada pembagi selain 1 dan dirinya, bukan bilangan prima
            }
        }
        return true;
    }

    // Method untuk mencetak bilangan prima dari 1 hingga n
    public static void printPrimes(int n) {
        System.out.println("Bilangan prima dari 1 hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        printPrimes(n);
        scanner.close();
    }
}
