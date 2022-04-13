package Tamrin1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi.Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Now enter your password:");
        String password = scanner.nextLine();
        System.out.println("Now enter your age:");
        String s = scanner.nextLine();
        int age = Integer.parseInt(s);
        System.out.println("Now enter your address:");
        String address = scanner.nextLine();
        System.out.println("Now enter your phone number:");
        String number = scanner.nextLine();
        Long phone = Long.parseLong(number);
        System.out.println("Now enter your education rate:");
        String rate = scanner.nextLine();
        Builder b = new Builder().setName(name) .setPassword(password) .setAge(age) .setAddress(address) .setPhoneNumber(phone) .setEducationRate(rate);
        b.setEducationRate(rate);
        System.out.println(b.getName());
        System.out.println(b.getAge());
        System.out.println(b.getAddress());
        System.out.println(b.getPhone_number());
        System.out.println(b.getEducation_rate());
        System.out.println(b.getPassword());
            }
    }

