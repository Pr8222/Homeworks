package Tamrin3;

public class Ford implements Cars{
    @Override
    public void cylinders(){
        System.out.println("This car has 8 cylinders");
    }
    @Override
    public void power(){
        System.out.println("The power is 1500 horse power");
    }
    @Override
    public void color(){
        System.out.println("The color is white");
    }
    @Override
    public void type(){
        System.out.println("The car is muscle");
    }
    @Override
    public void start(){
        System.out.println("It starts with a key");
    }
}
