package Tamrin2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clone p1 = new Clone();
        Clone p2 = null;
        Clone p3 = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!\nEnter your name please:");
        p1.name = scanner.nextLine();
        System.out.println("Now enter your age:");
        String s = scanner.nextLine();
        p1.age = Integer.parseInt(s);
        System.out.println("Now enter your job:");
        p1.job = scanner.nextLine();
        try {
            p2 = (Clone) p1.clone();
            p3 = (Clone) p1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }
        if (!p1.equals(p2) && !p1.equals(p3)){
            System.out.println(p1.name);
            System.out.println(p1.age);
            System.out.println(p1.job);
            System.out.println(p2.name);
            System.out.println(p2.age);
            System.out.println(p2.job);
            System.out.println(p3.name);
            System.out.println(p3.age);
            System.out.println(p3.job);
        }
    }
}
