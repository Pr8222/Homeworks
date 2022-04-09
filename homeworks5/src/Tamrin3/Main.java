package Tamrin3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Package p = new Package();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = s.nextLine();
        System.out.println("Enter you student number:");
        String sNum = s.nextLine();
        int num = Integer.parseInt(sNum);
        System.out.println("Enter your father's name:");
        String father = s.nextLine();
        p.setStudent_name(name);
        p.setStudent_num(num);
        p.setFather_name(father);
        int x, y, z, a, b;
        System.out.println("Enter your first grade");
        x = s.nextInt();
        System.out.println("Enter your second grade");
        y = s.nextInt();
        System.out.println("Enter your third grade");
        z = s.nextInt();
        System.out.println("Enter your forth grade");
        a = s.nextInt();
        System.out.println("Enter your fifth grade");
        b = s.nextInt();
        List<Integer> l = new ArrayList<>();
        l.add(x);
        l.add(y);
        l.add(z);
        l.add(a);
        l.add(b);
        System.out.println(p.getStudent_name());
        System.out.println(p.getStudent_num());
        System.out.println(p.getFather_name());
        for (int o : l) {
            System.out.println(o);
        }
    }
}