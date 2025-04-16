// import java.util.*;

public class inherit {
    public static void main(String[] args) {
        System.out.println("hello guich");

        basicinfo basicinfo = new basicinfo();
        User user = new User();
        Driver driver = new Driver();
        basicinfo.welcome();
        user.welcome();
        driver.welcome();
    }


}

class basicinfo {
    int id;
    String name;
    int age;
    String address;
    String phnNo;

    void welcome() {
        System.out.println("welcomeee to the user");
    }
}

class User extends basicinfo {
    String petname;
    String petId;

    @Override
    public void welcome() {
        System.out.println("welcome to the user who uses the appp");
    }
}

class Driver extends basicinfo {
    String vehicleName;
    String vehicleNumber;

    @Override

    public void welcome() {
        System.out.println("drivers are always welcome");
    }
}
