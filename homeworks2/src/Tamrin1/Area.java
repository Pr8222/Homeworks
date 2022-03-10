package Tamrin1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square areaSquare = new Square();
        Rectangular areaRectangular = new Rectangular();
        System.out.println("Select a shape to continue \n 1.square \n 2.rectangular");
        String shape = scanner.nextLine();
        int shapeNum = Integer.parseInt(shape);
        if(shapeNum == 1) {
            System.out.println("Enter side length");
            String sideSquare = scanner.nextLine();
            int sideSquareNum = Integer.parseInt(sideSquare);
            int AreaOfSquare = areaSquare.areaofsquare(sideSquareNum);
            System.out.println("Area of the square is: " + AreaOfSquare);
        }
        else if(shapeNum == 2){
            System.out.println("Enter long side length");
            String longSideR = scanner.nextLine();
            int longSide = Integer.parseInt(longSideR);
            System.out.println("Enter short side length");
            String shortSideR = scanner.nextLine();
            int shortSide = Integer.parseInt(shortSideR);
            int AreaR = areaRectangular.areaofrectangular(longSide, shortSide);
            System.out.println("Area of the rectangle is: " + AreaR);
        }
        else
            System.out.println("Please don't enter wrong number");
    }
}

