/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.io.*;

/**
 *
 * @author Hafiz
 */
public class Tes {
    public static void main (String [] args) throws Exception{
        System.out.println("User 1");
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Masukkan Tinggi Badan Anda (cm) = ");
        double TB = Double.parseDouble(br.readLine());
        System.out.print("Masukan Jenis Kelamin Anda (L/P) = ");
        String Kelamin = br.readLine();
        Manusia l = new Laki_Laki(TB,Kelamin);
        System.out.println("Berat Badan Ideal Laki-laki ini adalah "+l.HtgBBI());
        System.out.println();
        
        System.out.println("User 2");
        BufferedReader brp = new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Masukkan Tinggi Badan Anda (cm) = ");
        double TBp = Double.parseDouble(br.readLine());
        System.out.print("Masukan Jenis Kelamin Anda (L/P) = ");
        String Kelamin2 = brp.readLine();
        Manusia p = new Perempuan(TBp,Kelamin2);
        System.out.println("Berat Badan Ideal Perempuan ini adalah "+p.HtgBBI());
        
        
        
    }
}
