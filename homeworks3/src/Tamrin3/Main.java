package Tamrin3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int a = Integer.parseInt(num);
        TheNumber n = new TheNumber();
        if(a % 2 == 0){
            System.out.println(n.isEven(a));
            System.out.println(a + " is even.");
        }
        if(a % 2 == 1){
            System.out.println(n.isOdd(a));
            System.out.println(a + " is odd.");
        }
        if(a > 0){
            System.out.println(n.isPositive(a));
            System.out.println(a + " is positive.");
        }
        if(a < 0){
            System.out.println(n.isNegative(a));
            System.out.println(a + " is negative.");
        }
        else if(a == 0){
            System.out.println(n.isZero(a));
            System.out.println(a + " is zero.");
        }
    }
}
