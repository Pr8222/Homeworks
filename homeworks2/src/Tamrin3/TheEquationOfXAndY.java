package Tamrin3;

import java.util.Scanner;

public class TheEquationOfXAndY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Package alpha = new Package();
        Package beta = new Package();
        System.out.println("Please enter 6 numbers : ");
        System.out.println("Enter the first number: ");
        String number1  = scanner.nextLine();
        int a = Integer.parseInt(number1);
        System.out.println("Enter the second number: ");
        String number2 = scanner.nextLine();
        int b = Integer.parseInt(number2);
        System.out.println("Enter the third number: ");
        String number3 = scanner.nextLine();
        int c = Integer.parseInt(number3);
        System.out.println("Enter the forth number: ");
        String number4 = scanner.nextLine();
        int d = Integer.parseInt(number4);
        System.out.println("Enter the fifth number: ");
        String number5 = scanner.nextLine();
        int e = Integer.parseInt(number5);
        System.out.println("Enter the last number: ");
        String number6 = scanner.nextLine();
        int f = Integer.parseInt(number6);
        if( ( a * d ) - ( b * c ) != 0 ){
            int x = alpha.equation1( a , b , c , d , e , f );
            int y = beta.equation2( a , b , c , d , e , f );
            System.out.println("X is " + x + " and y is " + y + ".");
        }
        else{
            System.out.println("There is no true number for x and y!");
        }

    }
}
