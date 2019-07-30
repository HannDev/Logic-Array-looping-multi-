package com.belajar;

public class ArrayMultidimensi {
    public static void main(String[] args) {

// SETIAP ARRAY MULTIDIMESI SETELAH string PAKAI SIMBOL "[][]"


     String[][] kontak = {{"Rohman","085712","Jomblo"},{"Abdul","085743","Menikah"},{"Hani","085643","Kawin"}};
     for (int i=0; i<kontak.length; i++){
         System.out.println("Nama    :"+kontak[i][0]);
         System.out.println("Nomor   :"+kontak[i][1]);
         System.out.println("Status  :"+kontak[i][2]);
         System.out.println("----------------------");
        }
    }
}
