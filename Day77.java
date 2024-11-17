package isc;

public class Day77 {
        public static void main(String[] args) {
            String kata1 = "Donat Mart";
            String kata2 = "donat mart";
            String kata3 = "Donat Mart";

            boolean hasil1 = kata1.equals(kata2);
            boolean hasil2 = kata1.equals(kata3);

            System.out.println("Apakah 'kata1' sama dengan 'kata2'? " + hasil1);
            System.out.println("Apakah 'kata1' sama dengan 'kata3'? " + hasil2);
        }
    }
