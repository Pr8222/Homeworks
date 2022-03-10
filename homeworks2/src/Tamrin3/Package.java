package Tamrin3;

public class Package {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    int x;
    int y;
    public int equation1( int a , int b , int c , int d , int e , int f ){
        x = ( ( e * d ) - ( b * f )) / ( ( a * d ) - ( b * c ) );

        return x ;
    }
    public int equation2( int a , int b , int c , int d , int e , int f ) {
        y = ( (a * f) - (e * c) ) / ( (a * d) - (b * c) );
        return y;
    }
}