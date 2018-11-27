package datastructures;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by patrick.duff on 11/7/2018.
 */
public class Lists {

    public static void main(String[] args) {
        // 1. Create a collection
        ArrayList<String> cities = new ArrayList<>();

        // 2. Add some elements
        cities.add("Boise");
        cities.add("Chicago");
        cities.add("Toronto");
        cities.add("Miami");

        // 3. Iterate through collection

        for (String city : cities) {
            System.out.println(city);
        }

        // 4. Get the size
        int size = cities.size();
        System.out.println("There are " + size + " elements in the collection");

        // 5. Retrieve a specific element
        System.out.println("The first city in the list is " + cities.get(0));

        // 6. Remove an element
        System.out.println("Let's remove " + cities.get(1));
        cities.remove(1);
        size = cities.size();
        System.out.println("Now there are " + size + " elements in the collection");
        for (String city : cities) {
            System.out.println(city);
        }


    }
}
