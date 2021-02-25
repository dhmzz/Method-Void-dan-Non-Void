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
public class Void {
     int alas,tinggi,hasil;
 
    void Hitung(){
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Tinggi = ");
    tinggi = in.nextInt();
    System.out.print("Masukkan Alas = ");
    alas = in.nextInt();
    hasil = alas*tinggi*1/2;
    System.out.print("Luas segitiga tersebut adalah = "+hasil);
    }        

}