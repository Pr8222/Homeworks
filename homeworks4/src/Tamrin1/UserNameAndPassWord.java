package Tamrin1;

public class UserNameAndPassWord {
    public void name(String name) throws Exception{
        if( name != null && name.equals("Bruce")){
            System.out.println("Access granted!\nWelcome\nPlease enter you username and password to identify yourself:");
        }
        else{
            throw new NameException("Access denied!");
        }
    }
    public void user_and_pass(String user , String password) throws Exception{
        if (user != null && user.equals("TheMonsterMaster") && password != null && password.equals("B45U07C24")){
            System.out.println("Access granted!");
        }
        else{
            throw new CreditsExeption("Access denied!");
        }
    }
}
