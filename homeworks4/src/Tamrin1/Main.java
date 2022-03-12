package Tamrin1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserNameAndPassWord name = new UserNameAndPassWord();
        UserNameAndPassWord userpass = new UserNameAndPassWord();
        System.out.println("Enter the name: ");
        String n = scanner.nextLine();
        try{
            name.name(n);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        String user = scanner.nextLine();
        String password = scanner.nextLine();
        try {
            userpass.user_and_pass(user , password);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
