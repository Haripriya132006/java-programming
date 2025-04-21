//inheritance
//abstraction
//encapsulation
//polymorphismm


public class abstraction {
    public static void main(String[] args) {
        // Vehicle vehicle=new Vehicle(); .. this will throw an error
        // as abstract method ku object create pana mudiyadhuuuuu...
        // as it is concept and not implementation..
        // if at all object must me created for the abstract class...
        // then we must use the implementaion example for vehicle -> car is the implementation
        car car1 = new car();
        car1.sound();
        car1.color();
        car1.complyRegulations();
    }
}
// binding of variable and methods == encapsulation ...
// abstract class can have both concrete method and abstract methoddd...

// only abstract class can have abstract methodsss ...

abstract class Vehicle { // giving genralized methods ... // concepts implimented only by child
    int vehid;
    String name;

    public void complyRegulations() { // this is concrete method ...
        System.out.println("complyyy");
    }

    public abstract void sound(); // abstract methoddd //logic is written only by the childd

    public abstract void color();// it must not have a body ..
}

class car extends Vehicle {
    // @Override .. this part is optional if you really want to ensure if the
    // function is overriding
    public void sound() {
        System.out.println("vroom vroom .. crash");
    }

    // @Override .. this part is optional if you really want to ensure if the
    // function is overriding
    public void color() {
        System.out.println("black as the night sky");
    }
}