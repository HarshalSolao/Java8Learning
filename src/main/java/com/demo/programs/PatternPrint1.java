package com.demo.programs;

public class PatternPrint1 {
    public static void main(String[] args) {
        int i,j;
        int level = 15;
        for (i = 1; i <= level; i++) {
			for(j=1;j<=i;j++){
				System.out.print(String.format("%d ",j));
			}
			System.out.println();
        }
    }
}
