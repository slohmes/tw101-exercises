package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(constructLine(i,n));
        }
    }

    private static String constructLine(int i, int n) {
        StringBuilder line = new StringBuilder();
        for(int j = i; j < n; j++) {
            line.append(" ");
        }
        for(int k = 0; k < (i * 2 - 1); k++) {
            line.append("*");
        }
        return line.toString();
    }


//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);

        for(int i = n-1; i > 0; i--) {
            System.out.println(constructLine(i, n));
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for(int i = 1; i < n; i++) {
            System.out.println(constructLine(i,n));
        }
        System.out.println("Sarah");
        for (int i = n-1; i > 0; i--) {
            System.out.println(constructLine(i, n));
        }
    }
}
