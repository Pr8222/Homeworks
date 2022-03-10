package Tamrin1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num1:");
        String num1 = scanner.nextLine();
        int a = Integer.parseInt(num1);
        System.out.println("Please enter num2:");
        String num2 = scanner.nextLine();
        int b = Integer.parseInt(num2);
        Plus p = new Plus();
        System.out.println(p.multiplication(a , b));
        System.out.println(p.division(a , b));
        System.out.println(p.minus(a , b));
        System.out.println(p.plus(a , b));

    }
}
