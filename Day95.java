package isc;

public class Day95 {
    public static void main(String[] args) {
        int n = 5; // Ukuran tinggi segitiga
        
        // Segitiga siku-siku normal
        System.out.println("Segitiga Siku-Siku Normal:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Segitiga siku-siku terbalik
        System.out.println("\nSegitiga Siku-Siku Terbalik:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
