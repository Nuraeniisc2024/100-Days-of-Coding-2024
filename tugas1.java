import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin didata: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); 
        String[] mahasiswa = new String[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = scanner.nextLine();
        }
        System.out.println("\nDaftar Nama Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println((i + 1) + ". " + mahasiswa[i]);
        }
    }
}
