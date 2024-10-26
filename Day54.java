package isc;
import java.util.Scanner;
public class Day54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        for(int i = 1; i <= a; i++){
            if(i % 3 == 0){
                b++;
            }
        }
        System.out.println(b);
    }
}
