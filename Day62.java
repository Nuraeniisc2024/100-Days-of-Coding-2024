package isc;

public class Day62 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Loop berhenti saat i bernilai 5
            }
            System.out.println("nilai: " + i);
        }
        System.out.println("Loop selesai");
    }
}
