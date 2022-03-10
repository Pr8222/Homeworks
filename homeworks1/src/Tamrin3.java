import java.util.Scanner;

public class Tamrin3 {
    public static void main(String[] args) {
        // write your code here
        Scanner n = new Scanner(System.in);
        int x , y;
        char op;
        System.out.println("Please enter an operator");
        op = n.next().charAt(0);
        System.out.print("Please enter x :  ");
        x = n.nextInt();
        System.out.print("Please enter y :  ");
        y = n.nextInt();
        switch (op){
            case '+' :
                System.out.println("The sum of x and y is :  " + (x+y));
                break;
            case '-' :
                if( x > y ){
                    System.out.println("The minus of x and y is :  " +( x - y ));
                }
                else{
                    System.out.println("The minus of y and x is :  " + ( y - x ));
                }
                break;
            case '*' :
                System.out.println("The multiple of x and y is :  " + ( x * y ));
                break;
            case '/':
                System.out.println("The diversion of x and y is :  " + ( x / y ));
        }
    }
}
