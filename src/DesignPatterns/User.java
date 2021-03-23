package DesignPatterns;

public class User {


    private final String first_name;
    private final String last_name;
    private int age;
    private String address;
    private User(UserBuilder user){
        this.first_name=user.first_name;
        this.last_name=user.last_name;
        this.age=user.age;
        this.address=user.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder{
        public String first_name;
        public String last_name;
        public int age;
        public String address;
        public UserBuilder(String first_name,String last_name){
            this.first_name=first_name;
            this.last_name=last_name;
        }
        public UserBuilder age(int age){
            this.age=age;
            return this;
        }
        public UserBuilder address(String address){
            this.address=address;
            return this;
        }
        public  User build(){
            return new User(this);
        }


    }

    public static void main(String[] args) {
        User user= new UserBuilder("Mavunga","prosper").age(10).build();
        System.out.println(user);
    }
}
