package com.demo.programs;

public class PatternPrint3 {

    public static void main(String[] args) {
        int level = 5;
        for (int i = 0; i < level; i++) {
            for (int j = level - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
