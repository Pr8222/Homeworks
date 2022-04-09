package Class;


import java.util.Scanner;

public class Package {
    protected String Job;
    protected String Username;
    protected String Pass;
    protected int Age;
    protected String Family;
    protected String Name;
    public void enroll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi. Please enter you username:");
        Username = scanner.nextLine();
        System.out.println("Now enter your name:");
        Name = scanner.nextLine();
        System.out.println("Enter your Family name:");
        Family = scanner.nextLine();
        System.out.println("Enter your job:");
        Job = scanner.nextLine();
        System.out.println("How old are you:");
        String age = scanner.nextLine();
        Age = Integer.parseInt(age);
        System.out.println("Now set a password:");
        Pass = scanner.nextLine();
    }
}
