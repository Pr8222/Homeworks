package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Package p = new Package();
        Scanner s = new Scanner(System.in);
        p.enroll();
        System.out.println("Welcome. To join to your account please enter your username and password:");
        String user = s.nextLine();
        String pass = s.nextLine();
        if(user.equals(p.Username) && pass.equals(p.Pass)){
            System.out.println(p.Name);
            System.out.println(p.Family);
            System.out.println(p.Age);
            System.out.println(p.Job);
        }
        else {
            System.out.println("An error occurred");
        }
    }
}
