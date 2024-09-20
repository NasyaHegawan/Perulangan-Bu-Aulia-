package Perulangan;

import java.util.Scanner;

public class DeretARwhile {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan batas awal : ");
        int nilaiAwal = n.nextInt();
        System.out.println("Masukkan batas akhir : ");
        int nilaiAkhir = n.nextInt();
        System.out.println("Masukkan beda/selisih : ");
        int beda = n.nextInt();
        System.out.println("Deret Aritmatikanya adalah ");
        System.out.println();

        int i = nilaiAwal;
        while (i <= nilaiAkhir) {
            System.out.print(i + ",");
            i += beda;
        }
    }
}
