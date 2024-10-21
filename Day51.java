package isc;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama :");
        String tambahkan = input.nextLine();

        switch(tambahkan){
            case "nur":
            System.out.println("nur hadir pak!!");
            break;
            case "wanda":
            System.out.println("wanda hadir pak!!");
            break;
            default:
            System.out.println(tambahkan + " tidak hadir pakk!!");

        }

    }
}
