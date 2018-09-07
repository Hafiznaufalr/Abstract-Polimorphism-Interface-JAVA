/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hafiz
 */
public class karnivora {
    public static void main(String[] args){
        System.out.println("===== Hewan Default =====");
        hewan h = new hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("===== Hewan Kucing =====");
        hewan k = new kucing();
        k.setNama();
        k.setSuara();
        k.setBerat();
        
        System.out.println("===== Hewan Singa =====");
        hewan s = new singa();
        s.setNama();
        s.setSuara();
        s.setBerat();
    }
}
