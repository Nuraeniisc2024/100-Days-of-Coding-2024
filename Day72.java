package isc;

public class Day72 {
    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1; // Basis rekursi: faktorial 0 adalah 1
        } else {
            return n * hitungFaktorial(n - 1); // Memanggil diri sendiri
        }
    }

    public static void main(String[] args) {
        int angka = 5;
        int hasil = hitungFaktorial(angka);

        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }
}
