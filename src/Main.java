import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Primitive
        int five = 5;
        String name = "nothingBucket";

        //Object
        String string = "I am string";
        CookingMechanism nothingBucket = new CookingMechanism(name, five);
        nothingBucket.self();

        //Classes
        List<String> stringList = new ArrayList<>();
        CookingMechanism crockPot = new CookingMechanism("Cooker", 55);
        CookingMechanism smallCrockPot = new CookingMechanism("miniCrocker");
        System.out.println(smallCrockPot);
        System.out.println("\n");
        crockPot.self();
        smallCrockPot.self();
    }
}
