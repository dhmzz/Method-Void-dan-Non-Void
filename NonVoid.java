/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class NonVoid {
    int panjang,lebar,hasil;
    Scanner in = new Scanner(System.in);
    int panjang(){
        System.out.print("Masukkan panjang = ");
        panjang = in.nextInt();
        return panjang;
    }
    int lebar(){
        System.out.print("Masukkan lebar = ");
        lebar = in.nextInt();
        return lebar;
    }
    int hitung(){
        hasil = panjang*lebar;
        System.out.print("Luas Persegi tersebut adalah = "+hasil);
        return hasil;
    }
}
