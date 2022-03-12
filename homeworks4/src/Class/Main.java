package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Find s = new Find();
        String array[] = new String[2];
        for(int i = 0; i < 2; i++){
            System.out.println("Enter you name, lastname, and your age in one line : ");
            array[i] = input.nextLine();
        }
        try{
            s.Find(array);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
