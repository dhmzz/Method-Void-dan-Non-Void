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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nomer;
        Void Segitiga = new Void();
        NonVoid PersegiPanjang = new NonVoid();
        Scanner in = new Scanner(System.in);
        System.out.println("Saya membuat program menghitung Persegi dan Segitiga");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Perhitungan Segitiga menggunakan method void");
        System.out.println("2. Perhitungan Persegi Panjang menggunakan method Non Void");
        System.out.print("Program mana yang mau anda pilih? ");
        nomer = in.nextInt();
        System.out.println("--------------------------------------------------------");
        if(nomer == 1){
             Segitiga.Hitung();
        }
        else if(nomer == 2){
             PersegiPanjang.lebar();
             PersegiPanjang.panjang();
             PersegiPanjang.hitung();
        }
        
        
    
    }    
}
