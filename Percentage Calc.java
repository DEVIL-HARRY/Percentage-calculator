// program fo calculate percentage

package com.company;

import java.util.Scanner;

public class CWH_06_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of Hindi");
        int H = sc.nextInt();
        System.out.println("Marks of English");
        int E = sc.nextByte();
        System.out.println("Marks of Maths");
        int M = sc.nextByte();
        System.out.println("Marks of Science");
        int S = sc.nextByte();
        System.out.println("Marks of Physics");
        int P = sc.nextByte();
        System.out.println("Percentage");
        int pst = (H+E+M+S+P)*100/500;
        System.out.print(pst + "%");
        System.out.println("Average");
        int avg = (H+E+M+S+P)/5;
        System.out.print(avg);

    }
}
