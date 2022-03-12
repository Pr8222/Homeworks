package Tamrin3;

public class Check {
    public void check(String s) throws Exception{
        if (s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9")) {
                throw new NumberException("You should not enter a number in your string");
        } else {
            System.out.println("The length of the string is "+ s.length() + " characters.");
        }
        }
    }
