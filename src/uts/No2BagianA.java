/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class No2BagianA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("banyaknya data rekursif = ");
        int inputDataRekursif = scanner.nextInt();
        
        int hasil = rekursif(inputDataRekursif);
        System.out.println("\n" + "total operasi data rekursif = " + hasil);
    }

    public static int rekursif(int value) {
        int S, x;

        x = (3 * value) - 1;
        // jika nilai value sudah mencapai satu maka operasi yang akan dilakukan = operasi var x
        if (value == 1) {
            S = x;
        } else {
            // perulangan akan terus di lakukan sampai nilai value mencapai 1
            S = x + (rekursif(value - 1));

        }
        System.out.print(x + " ");
        // variabel S
        return (S);
    }
}
