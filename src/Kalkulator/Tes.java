/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

import java.io.*;

/**
 *
 * @author Hafiz
 */
public class Tes {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
        
        System.out.print("Masukan bilangan pertama: ");
        double Bil1=Double.parseDouble(br.readLine());
        System.out.print("Masukan bilangan Kedua: ");
        double Bil2=Double.parseDouble(br.readLine());
        Operator O = new Kalkulator(Bil1,Bil2); 
        System.out.println();
        System.out.println("Hasil Penjumlahan= "+O.Penjumlahan());
        System.out.println("Hasil Pengurangan= "+O.Pengurangan());
        System.out.println("Hasil Perkalian= "+O.Perkalian());
         System.out.println("Hasil Pembagian= "+O.Pembagian());
        
    }   
   
}
