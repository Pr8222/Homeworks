package Tamrin2;

import java.util.Scanner;

public class Enroll<name> {
    public static String x;
    private static Enroll enroll;
    public synchronized static Enroll getEnrollInstance(){
        if (enroll == null){
            enroll = new Enroll();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name to enroll");
            x = scanner.nextLine();
        }
        return enroll;
    }
    private Enroll(){}
    public void show(){
        System.out.println("You are enrolled!\nHi " + x + "!");
    }
}
