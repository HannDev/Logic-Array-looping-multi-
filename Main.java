package com.belajar;

public class Main {

    //DASASR LOGIC

    public static void main(String[] args) {

        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                if (x==y) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
