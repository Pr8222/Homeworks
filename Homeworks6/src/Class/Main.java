package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String s1 = scanner.nextLine();
        arr[0] = Integer.parseInt(s1);
        System.out.println("Enter the second number:");
        String s2 = scanner.nextLine();
        arr[2] = Integer.parseInt(s2);
        System.out.println("Now enter 1 or 2 ");
        String s3 = scanner.nextLine();
        arr[1] = Integer.parseInt(s3);

        Calculate b = Factory.getCalculate(arr[1]);
        b.calc(arr[0] , arr[2]);

    }
}
