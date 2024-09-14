package StokBarang;

public class GudangBarang {
    public static void main(String[] args) {
    System.out.print("Stok awal barang digudang :");
    short StokAwal = 1200;
    System.out.println(StokAwal);
    System.out.print("Barang baru yang masuk :");
    byte barangbaru = 50;
    System.out.println(barangbaru);

    System.out.print("Total stok barang yang ada digudang sekarang :");
    StokAwal += barangbaru;
    System.out.println(StokAwal);
    }
    }
