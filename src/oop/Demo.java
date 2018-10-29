package oop;

/**
 * Created by patrick.duff on 10/3/2018.
 */

class Person {

    String name;
    String email;
    String phone;

    void walk() {
    System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(email);
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

public class Demo {
    public static void main(String[] args) {
        //Instantiating an object
        Person person1 = new Person();

        //define properties
        person1.name = "Joe";
        person1.email = "joe@test.com";
        person1.phone = "7897897890";

        //Abstraction
        person1.walk();
        person1.eat();
        person1.sleep();

        Person person2 = new Person();
        person2.name = "Sarah";
        person2.sleep();
        /*
        //Person

        //Attributes, variables, adjectives, descriptors

        String name = "Joe";
        String email = "Joe@test.com";
        String phone = "7897897890";

        //Action, activity, behavior
        //System.out.printf("%s is walking%n", name);
        walking(name);
        System.out.printf("%s is eating%n", name);


        String name2 = "Sarah";
        String email2 = "sarah@test.com";
        String phone2 = "7897897891";

        //System.out.println(name2 + " is walking");
        walking(name2);
        System.out.println(name2 + " is eating");

        //What about binding attributes and properties together?
    }


    //Enhance by adding function to minimize code
    static void walking(String name) {
        System.out.println(name + " is walking");

    }*/
    }
}



