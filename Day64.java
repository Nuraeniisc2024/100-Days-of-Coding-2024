package isc;
import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
                outerLoop: // label untuk loop luar
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        System.out.println("i = " + i + ", j = " + j);
                        
                        if (j == 3) {
                            System.out.println("Keluar dari outerLoop karena j = 3");
                            break outerLoop; // keluar dari loop yang dilabeli 'outerLoop'
                        }
                    }
                }
                System.out.println("Program selesai.");
            }
        }
