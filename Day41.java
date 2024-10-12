package D41;

import java.util.Scanner;

public class nuraenii {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String a = input.nextLine();
    String b = input.nextLine();
    
    int nilai = Integer.parseInt(a);
    int angka = Integer.parseInt(b);
    int n1 = nilai + angka;
    int n2 = nilai - angka;
    int n3 = nilai * angka;
    int n4 = nilai / angka;
    int n5 = nilai % angka;
    
    boolean nur = n1 > n3;
        System.out.println("penjumlahan : " + n1 );
        System.out.println("pengurangan : " + n2 );
        System.out.println("perkalian : " + n3 );
        System.out.println("pembagian : " + n4 );
        System.out.println("modulus : " + n5 );
        System.out.println("apakah hasil penjumlahan lebih besar dari perkalian ? " + nur);
            
            }
}
