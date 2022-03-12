package Tamrin2;

public class Delta {
    public void delta (int a, int b, int c) throws Exception
    {
        int s = ( b * b ) - ( 4 * a * c );
        if( s < 0 )
            throw new Exception ("In this equation you can't find true numbers\n");
        else{
            double x1, x2;
            x1 = (-b + Math.sqrt(s) )/(2 * a);
            x2 = (-b - Math.sqrt(s) )/(2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2 +"\nThe equation answers were true numbers.");
        }

    }

}