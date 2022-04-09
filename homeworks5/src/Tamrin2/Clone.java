package Tamrin2;

public class Clone implements Cloneable {
    public String name;
    public String job;
    public int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
