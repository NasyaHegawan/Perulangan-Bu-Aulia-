package Perulangan;

import java.util.Scanner;

public class DeretARfor {
    public static void main(String[] args) {
        int nilaiAtas, nilaiBawah, beda;
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan batas awal : ");
        nilaiAtas = s.nextInt();
        System.out.println("Masukkan batas akhir : ");
        nilaiBawah = s.nextInt();
        System.out.println("Masukkan beda/selisih : ");
        beda = s.nextInt();
        System.out.println();
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = nilaiAtas; i <= nilaiBawah; i+=beda) {
                System.out.print(i + ",");
            }
        }
    }

