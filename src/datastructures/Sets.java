package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by patrick.duff on 11/7/2018.
 */
public class Sets {
    public static void main(String[] args) {
        // Sets are like lists, but can only take unique elements
        // HashSet does not have any set order
        // LinkedHashSet is in order that they were entered
        // TreeSet = alphabetical order
        // Sets are basically unique lists

        // 1. Define the collection

        Set<String> animals = new LinkedHashSet<>();

        // 2. Adding elements
        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("snake");
//        System.out.println(animals.size() + " " + animals);

        animals.add("cat");
        animals.add("snake");
        animals.add("goose");
        System.out.println(animals.size() + " " + animals);

        // Create a new set that we can use for comparison
        Set<String> farmAnimals = new HashSet<>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        // What is the intersection between animals and farmAnimals (only elements that are in both)
        // 1. Copy existing set into a new set
        Set<String> intersectionSet = new TreeSet<>(animals);
        System.out.println(intersectionSet);
        // 2. Retain only elements that are also in the other set
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is " + intersectionSet);

        // What is the union (all elements in both sets, minus any duplicates)

        Set<String> unionSet = new HashSet<>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is " + unionSet);

        // What is the difference (animals but not farmAnimals. )
        Set<String> differenceSet = new HashSet<>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is " + differenceSet);
    }
}
