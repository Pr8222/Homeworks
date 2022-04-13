package Tamrin3;

public class Jeep implements Cars {
    @Override
    public void cylinders(){
        System.out.println("This car has 16 cylinders");
    }
    @Override
    public void power(){
        System.out.println("The power is 3000 horse power");
    }
    @Override
    public void color(){
        System.out.println("The color is yellow");
    }
    @Override
    public void type(){
        System.out.println("The car is off-road");
    }
    @Override
    public void start(){
        System.out.println("It starts with a key");
    }
}
