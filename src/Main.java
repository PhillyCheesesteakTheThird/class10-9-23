import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Primitive
        int five = 5;
        char character = '1';

        //Object
        String string = "I am string";
        //Classes
        List<String> stringList = new ArrayList<>();
        CookingMechanism crockPot = new CookingMechanism("Cooker", 55);
        CookingMechanism smallCrockPot = new CookingMechanism("miniCrocker");
        crockPot.self();
        smallCrockPot.self();
    }
}
