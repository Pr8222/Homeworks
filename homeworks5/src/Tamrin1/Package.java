package Tamrin1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Package {
    public void Package() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String nam = scanner.nextLine();
        System.out.println("Enter your student number:");
        String num = scanner.nextLine();
        int studentnum = Integer.parseInt(num);
        System.out.println("What was your score?");
        String score = scanner.nextLine();
        int average = Integer.parseInt(score);
        Map map = new HashMap();
        map.put("name",nam);
        map.put("student number",studentnum);
        map.put("average",average);
        System.out.println(map.get("name"));
        System.out.println(map.get("student number"));
        System.out.println(map.get("average"));
    }
}
