//boiler plate code... code which is repeated in pats of codeee...
//interface .. contains abstract methodsss ...   only abstract methods
//overcomes the diamond problemmm .. achieves multiple inheritancee - ambiguity
//cannot create a object for interface ...
public class interfaces {
    public static void main(String[] args) {
        services service=new services();
        service.pets_sold_so_far();
        service.pets_that_are_being_sold();
        service.buy_a_pet();
        service.give_review();
    }
    //making object using implementation 

}

interface Seller{
    //can contain public or static variables
    public void pets_sold_so_far(); //by default the methods are bastract methods
    public void pets_that_are_being_sold();
}
interface Buyer{
    public void pets_that_are_being_sold(); //common for both seller and buyer .. still didnt raise an ambiquity
    //as the logic will be written only inside the class
    public void  buy_a_pet();
    public void give_review();
}


class services implements Seller, Buyer{
    @Override
    public void pets_sold_so_far() {
        System.out.println("the shop has sold 100+ petsss...everyone loves them");
        
    }
    public void pets_that_are_being_sold(){
        System.out.println("cats...\ndogs...\nfishes...");
    }

    public void buy_a_pet(){
        System.out.println("let me buy a kittennnnnn.....");
    }
    public void give_review(){
        System.out.println("the pet is soo gooodddd 5 star ... for review");
    }
}


