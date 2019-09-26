/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan5;

/**
 *
 * @author 
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : PBO2
 * NIM      : 10118069
 * Deskripsi program : Program ini berisi program untuk menampilkan jumlah 
 * kambing global
 * 
 */
public class KambingGlobal {
    
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);                
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);        
    }    
    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    }    
}
