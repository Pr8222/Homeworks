package Class;


public class calcPlus implements Calculate{

    @Override
    public void calc(int a, int b) {
        System.out.print("The plus is: ");
        System.out.print(a + b);
    }
}
