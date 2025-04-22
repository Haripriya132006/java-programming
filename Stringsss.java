//string is immutable in java
//string builder .. it can be used 
//it is faster than normal string .. mutable .. uses only one memory space 
//
public class Stringsss {
    public static void main(String[] args){
        String pet="cat";
        String mypet="cat";
        System.out.println("normal check "+(pet==mypet));
        String tenant=new String("cat");
        System.out.println("shallow check "+(pet==tenant));
        System.out.println("deep check "+(pet.equals(tenant)));

// string builder(not thread safe) -- buffer(is thread safe)

        StringBuilder meaw=new StringBuilder("helloguich");
        System.out.println(meaw);
        meaw.append(""+1);
        System.out.println(meaw.capacity());
        System.out.println(meaw);

//METHODS THAT ARE USED COMMONLY IN STRING 
 
//charAt    ... works similar to + in string ... 
//contains -  like "in" in python -> [{(i in "pie")}]
//ends with 
//begins with 
//equals
//equalsIgnoreCase --ignores case (upper case or lowercase)
//indexof -- returns index of a character or a string ...
//isEmpty..  --- Null pointer exception -- when null value is being accessed ... 
//length
//replace
//substring 
//trim - removes front and trailing spacess 
    }


}
