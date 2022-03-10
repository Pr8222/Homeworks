package Tamrin2;

public class Package {
    public int a;
    public int zarib_a;
    public int b;
    public int zarib_b;
    public int c;
    public int zarib_c;
    public int d;
    public int Zarib_d;
    int average;
    public int ave( int a , int b , int c , int d , int a1 , int b1 , int c1 , int d1){
        average = ( (a * a1) + (b * b1) + (c*c1) + (d*d1) ) / a1 + b1 + c1 + d1;
        return average;
    }
}