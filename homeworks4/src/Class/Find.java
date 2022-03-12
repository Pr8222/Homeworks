package Class;

public class Find {
    public void Find(String arr[] ) throws Exception{
        if(arr[0].equals("Parsa Rohani 18") || arr[1].equals("Omid Piri 19"))
            throw new Error("One of the users has already assigned!");
        else
            System.out.println("You are a new user welcome!");
    }
    }
