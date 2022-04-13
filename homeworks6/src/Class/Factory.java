package Class;

public class Factory {
    public static Calculate getCalculate(int a){
     switch (a){
         case 1:
             return new calcPlus();
         case 2:
             return new calcMinus();
         default:
             return null;

     }
    }
}
