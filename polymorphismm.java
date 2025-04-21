public class polymorphismm {
    public static void main(String[] args) {
        Animal animal=new Animal();
        cat cattu=new cat();
        animal.sound();
        cattu.sound();
    }
}

class Animal{
    public void sound(){
        System.out.println("yenamo yedho...oru satham");
    }
}

class cat extends Animal{
    @Override  //just to check for errors and to check if overwritting occurs
    public void sound(){
        System.out.println("meaew meaw");
    }
}