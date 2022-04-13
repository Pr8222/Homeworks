package Tamrin1;

public class Builder {
    String name;
    String password;
    int age;
    String address;
    Long phone_number;
    String education_rate;

    public Builder setName(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setPassword(String password){
        this.password = password;
        return this;
    }

    public String getPassword() {
        return "No No No! You won't get the user's password even you are the real user";
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAddress(String address){
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Builder setPhoneNumber(Long phone_number){
        this.phone_number = phone_number;
        return this;
    }
    public Long getPhone_number() {
        return phone_number;
    }

    public Builder setEducationRate(String education_rate){
        this.education_rate = education_rate;
        return this;
    }

    public String getEducation_rate() {
        return education_rate;
    }
}
