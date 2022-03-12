package Tamrin3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Check n = new Check();
        System.out.println("Enter a string");
        String string = input.nextLine();
        try{
            n.check(string);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
