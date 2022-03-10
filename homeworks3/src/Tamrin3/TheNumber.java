package Tamrin3;

public class TheNumber implements MyInteger{
    @Override
    public int isEven(int a) {
            return 1;
    }

    @Override
    public int isOdd(int a) {
        return 2;
    }

    @Override
    public int isPositive(int a) {
        return 3;
    }

    @Override
    public int isNegative(int a) {
        return 4;
    }

    @Override
    public int isZero(int a) {
        return 0;
    }
}
