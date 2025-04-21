// import java.util.*;
//override is only used when inheriting method from another classss
//finding common pro
public class inherit {
    public static void main(String[] args) {
        System.out.println("hello guich");

        basicinfo basicinfo = new basicinfo(); //calls constructor

        basicinfo basicinfo2=new basicinfo("hari",10); //initializing an objecttt 
        System.out.println(basicinfo2.getid());

        basicinfo2.setid(25); //false condition for id
        System.out.println(basicinfo2.getid()); // we can see that the id didnt change form before ... 

        basicinfo2.setid(250); //true condition
        System.out.println(basicinfo2.getid());  //id changesss

        User user = new User(); //calls constructor in basic info..
        Driver driver = new Driver(); //calls constructor in basic info..
        basicinfo.welcome();
        user.welcome();
        driver.welcome();
    }


}
//pojo class - class with only variablessss .. and right click to selct generate 
 class basicinfo { //super class??

    // keeping all variables as private is recomendedd

    // using private binds the variables to their respective methods onlyyyy achieving full encapsulationn...
    //if private it can be only used by the specific class and its methods ...
    int id; // we  put this as private the value can be accessed and changed onl by getters and setters ...
    String name;
    int age;
    String address;
    String phnNo;

    basicinfo(String name,int age){ //parametrized constructor ..
        this.name=name;
        this.id=1234;
        this.age=age;
        System.out.println("id: "+this.id+" name given in constructor "+this.name+" age "+this.age);
    }

    basicinfo(){
        System.out.println("\ncontructor is calledddd //na than da constructor//");
    }

    void welcome() {
        System.out.println("welcomeee to the user");
    }

    public int getid(){
        return id;
    }
    public void setid(int id){
        if (id<100){
            System.out.println("invalid id so cant changeee"); // now we can set value conditionally;
        }
        else{
            System.out.println("valid id change so yeah it is changeddd");
            this.id=id;
        }
        
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
