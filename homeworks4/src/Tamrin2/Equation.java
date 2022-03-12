package Tamrin2;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Delta D = new Delta();
        Scanner num = new Scanner(System.in);
        System.out.println("Please Enter three numbers: ");
        String num1 = num.nextLine();
        int a = Integer.parseInt(num1);
        String num2 = num.nextLine();
        int b = Integer.parseInt(num2);
        String num3 = num.nextLine();
        int c = Integer.parseInt(num3);
        try {
            D.delta(a,b,c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
