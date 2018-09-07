/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author Hafiz
 */
public class Kalkulator implements Operator{
    private double bil1,bil2;
    
    public Kalkulator(double Bil1,double Bil2){
        this.bil1 = Bil1;
        this.bil2 = Bil2;
    }
    public double getbil1(){
        return bil1;
    }
    public double getbil2(){
        return bil2;
    }
    @Override
    public double Penjumlahan(){
       return bil1 + bil2;
    }
  
    @Override
    public double Pengurangan(){
       return bil1 - bil2;
    }
    @Override
    public double Perkalian(){
       return bil1 * bil2;
    }
    @Override
    public double Pembagian(){
       return bil1 / bil2;
    }
}
