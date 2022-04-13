package Tamrin3;

public class Main {
    public static void main(String[] args) {
        Cars cars1 = CarsFactory.getCars(Cars.BMW);
        cars1.cylinders();
        cars1.power();
        cars1.color();
        cars1.type();
        cars1.start();
        System.out.print("\n");
        Cars cars2 = CarsFactory.getCars(Cars.Benz);
        cars2.cylinders();
        cars2.power();
        cars2.color();
        cars2.type();
        cars2.start();
        System.out.print("\n");
        Cars cars3 = CarsFactory.getCars(Cars.Ford);
        cars3.cylinders();
        cars3.power();
        cars3.color();
        cars3.type();
        cars3.start();
        System.out.print("\n");
        Cars cars4 = CarsFactory.getCars(Cars.Jeep);
        cars4.cylinders();
        cars4.power();
        cars4.color();
        cars4.type();
        cars4.start();

    }
}
