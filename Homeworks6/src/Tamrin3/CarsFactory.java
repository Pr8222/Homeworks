package Tamrin3;

public class CarsFactory {
    public static Cars getCars(int c){
        switch (c){
            case 1:
                return new BMW();
            case 2:
                return new Benz();
            case 3:
                return new Ford();
            case 4:
                return new Jeep();
            default:
                return null;
        }
    }
}
