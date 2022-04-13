package Class;

public class calcMinus implements Calculate {

    @Override
    public void calc(int a, int b) {
        System.out.print("The minus is: ");
        System.out.print(a - b);
    }
}
