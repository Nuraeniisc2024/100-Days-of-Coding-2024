package isc;

public class Day94 {
    public static void main(String[] args) {
        int n = 5; // Ukuran tinggi segitiga

        // Loop untuk baris
        for (int i = 1; i <= n; i++) {
            // Loop untuk mencetak asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
