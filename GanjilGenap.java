package ganjilgenap;

import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        int i, bil, jumGen = 0, jumGan = 0;
        System.out.println("Masukkan sebuah integer:");
        Scanner m = new Scanner(System.in);
        System.out.print("Maukan jumlah angka = ");
        bil = m.nextInt();
        System.out.print("Maukan jumlah angka2 = ");
        bil = m.nextInt();
        System.out.print("Maukan jumlah angka3 = ");
        bil = m.nextInt();
        if (bil % 2 == 0) {
            jumGen = jumGen + bil;
            System.out.println("jumlah dominan genap");
        } else {
            jumGan = jumGan + bil;
            System.out.println("jumlah dominan ganjil");
        }
    }

}
