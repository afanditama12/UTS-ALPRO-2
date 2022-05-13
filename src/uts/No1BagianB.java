/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class No1BagianB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampilanProgram();

    }
    // fungsi untuk kode pelanggan
    public static void kodePelanggan(String kode) {
        if (kode.equals("R")) {
            System.out.println("Kode pelanggan anda adalah Reguler");
        } else if (kode.equals("C")) {
            System.out.println("Kode pelanggan anda adalah Paket Spesial");
        } else if (kode.equals("V")) {
            System.out.println("Kode pelanggan anda adalah VIP");
        }
    }
    // fungsi test kode pelanggan / opsional (boleh dipakai / tidak)
    public static void testKodePelanggan() {
        kodePelanggan("V");
    }
    // fungsi pemakaian data 
    public static void pemakaianData(int kuota, String kode) {
        if (kuota <= 50) {
            if (kode.equals("R")) {
                int valueFirst = 2000;
                System.out.println("Biaya yang harus di bayar : " + valueFirst);
            }
            if (kode.equals("C")) {
                int valueSecond = 5000;
                System.out.println("Biaya yang harus di bayar : " + valueSecond);
            }
            if (kode.equals("V")) {
                int valueThird = 7500;
                System.out.println("Biaya yang harus di bayar : " + valueThird);
            }
        } else if (kuota >= 51 && kuota <= 80) {
            if (kode.equals("R")) {
                int valueFirst = 4500;
                System.out.println("Biaya yang harus di bayar : " + valueFirst);
            }
            if (kode.equals("C")) {
                int valueSecond = 7000;
                System.out.println("Biaya yang harus di bayar : " + valueSecond);
            }
            if (kode.equals("V")) {
                int valueThird = 10000;
                System.out.println("Biaya yang harus di bayar : " + valueThird);
            }
        } else if (kuota >= 80) {
            if (kode.equals("R")) {
                int valueFirst = 6500;
                System.out.println("Biaya yang harus di bayar : " + valueFirst);
            }
            if (kode.equals("C")) {
                int valueSecond = 10000;
                System.out.println("Biaya yang harus di bayar : " + valueSecond);
            }
            if (kode.equals("V")) {
                int valueThird = 15000;
                System.out.println("Biaya yang harus di bayar : " + valueThird);
            }
        } 
    }
    // fungsi test pemakaiaan data / opsional (boleh dipakai / tidak)
    public static void testPemakaianData() {
        pemakaianData(51, "V");
    }
    // fungsi tampilan program
    public static void tampilanProgram() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan kode pelanggan : ");
        String inputKodePelanggan = scanner.next();
        
        if (inputKodePelanggan.equals("R")) {
            kodePelanggan("R");
        } else if (inputKodePelanggan.equals("C")) {
            kodePelanggan("C");
        } else if (inputKodePelanggan.equals("V")) {
            kodePelanggan("V");
        } else {
            System.out.println("Maaf kode pelanggan yang anda masukan salah");
            // program akan keluar jika kode pelanggan yang dimasukan salah
            System.exit(0);
        }
        
        System.out.print("Masukan jumlah pemakaian data : ");
        int inputPemakaianData = scanner.nextInt();
        
        if (inputPemakaianData <= 50) {
             pemakaianData(inputPemakaianData, inputKodePelanggan);
        } else if (inputPemakaianData == 51 && inputPemakaianData <= 80) {
            pemakaianData(inputPemakaianData, inputKodePelanggan);
        } else if (inputPemakaianData >= 80) {
            pemakaianData(inputPemakaianData, inputKodePelanggan);
        }
    }
    // fungsi test tampilan program (boleh dipakai / tidak)
    public static void testTampilanProgram() {
        tampilanProgram();
    }
}
