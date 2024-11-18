package isc;

public class Day78 {
        public static void main(String[] args) {
            String kata1 = "Donat Mart";
            String kata2 = "donat mart";
            String kata3 = "DONAT MART";

            boolean hasil1 = kata1.equalsIgnoreCase(kata2);
            boolean hasil2 = kata1.equalsIgnoreCase(kata3);
            boolean hasil3 = kata2.equalsIgnoreCase(kata3);
    

            System.out.println("Apakah 'kata1' sama dengan 'kata2'? " + hasil1);
            System.out.println("Apakah 'kata1' sama dengan 'kata3'? " + hasil2);
            System.out.println("Apakah 'kata2' sama dengan 'kata3'? " + hasil3);
        }
    }
