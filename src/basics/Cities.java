package basics;

import java.util.Arrays;

/**
 * Created by patrick.duff on 9/27/2018.
 */
public class Cities {
    public static void main(String[] args) {
        //Declare and define an array
//        String[] cities ={"New York", "San Francisco", "Dallas", "Miami"};
//        System.out.println(Arrays.asList(cities));
//
//        String[] countries;
//        countries = new String[3];
//
//        countries[1] = "USA";
//        countries[0] = "Scotland";
//        countries[2] = "Australia";
//        System.out.println(Arrays.toString(countries));

        //Declare the array
        String[] states = new String[5];
        states[0] = "Utah";
        states[2] = "Colorado";
        states[1] = "Florida";
        states[3] = "Washington";
        states[4] = "Idaho";
        int i = 0;
        do{
           System.out.println(states[i]);
            i = i + 1;
        } while (i < 5);

        int n = 0;
        boolean stateFound = false;
        while(!stateFound) {
            String state = states[n];
            System.out.println(state);
            if (state == "Idaho"){
                System.out.println("State found at position " + n);
                stateFound = true;
            }
            n++;
        }
        for (i = 0; i < states.length; i++) {
            System.out.println(states[i] + ", ");
        }

    }
}
