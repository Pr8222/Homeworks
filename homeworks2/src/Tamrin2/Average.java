package Tamrin2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Package miangin = new Package();
        System.out.println("Please enter student ID : ");
        String student = scanner.nextLine();
        int studentID = Integer.parseInt(student);
        System.out.println("Please enter the 1st grade: ");
        String num1 = scanner.nextLine();
        int a = Integer.parseInt(num1);
        System.out.println("Please enter the grade's coefficient: ");
        String zarib1 = scanner.nextLine();
        int a1 = Integer.parseInt(zarib1);
        System.out.println("Please enter the 2nd grade: ");
        String num2 = scanner.nextLine();
        int b = Integer.parseInt(num2);
        System.out.println("Please enter the grade's coefficient: ");
        String zarib2 = scanner.nextLine();
        int b1 = Integer.parseInt(zarib2);
        System.out.println("Please enter the 3rd grade: ");
        String num3 = scanner.nextLine();
        int c = Integer.parseInt(num3);
        System.out.println("Please enter the grade's coefficient: ");
        String zarib3 = scanner.nextLine();
        int c1 = Integer.parseInt(zarib3);
        System.out.println("Please enter the 4th grade: ");
        String num4 = scanner.nextLine();
        int d = Integer.parseInt(num4);
        System.out.println("Please enter the grade's coefficient: ");
        String zarib4 = scanner.nextLine();
        int d1 = Integer.parseInt(zarib4);
        System.out.println("Please enter numbers and zaribs : ");
        int average = miangin.ave( a , b , c , d , a1 , b1 , c1 , d1 );
        if( average > 10 ){
            System.out.println("The student with student ID : " + studentID + " has been passed!\nCongrats!");
        }
        else{
            System.out.println("The student with student ID : " + studentID + " has been conditioned!\nKeep up the good work");
        }

    }
}
