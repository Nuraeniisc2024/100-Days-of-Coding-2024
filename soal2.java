package isc;
import java.util.Scanner;
public class tugas2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Berapa banyak elemen yang ingin ditambahkan? ");
            int jumlahElemen = scanner.nextInt();
            scanner.nextLine();
    
            String[] array = new String[jumlahElemen];
    
            for (int i = 0; i < jumlahElemen; i++) {
                System.out.print("Masukkan nama teman ke-" + (i + 1) + ": ");
                array[i] = scanner.nextLine();
            }
    
            System.out.println("\nElemen array:");
            for (int i = 0; i < jumlahElemen; i++) {
                System.out.println("Indeks " + i + ": " + array[i]);
            }
    
            System.out.print("\nMasukkan indeks elemen yang ingin diubah: ");
            int indeks = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Masukkan nilai baru: ");
            String nilaiBaru = scanner.nextLine();
            array[indeks] = nilaiBaru;
    
            System.out.println("\nElemen array setelah diperbarui:");
            for (int i = 0; i < jumlahElemen; i++) {
                System.out.println("Indeks " + i + ": " + array[i]);
            }
            scanner.close();
        }
}
