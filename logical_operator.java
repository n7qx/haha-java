package com.latihan;

public class Operator {
    public static void main(String[] args) {
        int angka1, angka2, angka3, angkaTerbesar;
        angka1 = 62;
        angka2 = 90;
        angka3 = 56;
        
        if (angka1 > angka2 && angka1 > angka3) {
            angkaTerbesar = angka1;
        } else if (angka2 > angka1 && angka2 > angka3){
            angkaTerbesar = angka2;
        } else {
            angkaTerbesar = angka3;
        }
        
        System.out.println("Angka paling besar adalah " + angkaTerbesar);
    }
    
}
