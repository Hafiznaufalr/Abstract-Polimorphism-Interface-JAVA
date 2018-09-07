/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Hafiz
 */
public class Perempuan extends Manusia{
    private double TB;
    private String Kelamin;
    
    public Perempuan (double TB,String Kelamin){
        this.TB = TB;
        this.Kelamin = Kelamin;
        
    }
    @Override
    public double getTB(){
        return TB;
    }
    @Override
    public String getKelamin(){
        return Kelamin;
    }
    @Override
    public double HtgBBI(){
        return (TB-100)-((TB-100)*20/100);
    }
}
