package com.demo.programs;

public class PatternPrint2 {
    public static void main(String[] args) {
        int level = 6;
        int i, j;
        for (i = 1; i <= level; i++) {
            for(j = 2 * (level-i);j>0;j--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
