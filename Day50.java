package isc;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka:");
        int a = input.nextInt();
       
        if(a % 5 == 0 && a % 3 == 0 ){
            System.out.println("master class");
        }else if(a % 5 == 0){
            System.out.println("pride of 5");
        }else if(a % 3 == 0){
            System.out.println("pride of 3");
        }else{
            System.out.println("kosong");
        }
        }
        }
    

