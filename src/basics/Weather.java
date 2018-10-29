package basics;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by patrick.duff on 9/21/2018.
 */
public class Weather {
    public static void main(String[] args) {
        // This program will give suggestions of what to wear based on weather (temperature)

        int temperature = 65;
        String sunCondition = "Overcast";

        if (temperature > 80) {
            System.out.println("It's pleasant. Wear shorts and a t-shirt");
        }
        else if ((temperature > 60) && (sunCondition == "Sunny")){
            System.out.println("It's a little cooler. Perhaps wear a long sleeved shirt and jeans.");
            System.out.println("Wear a hat to keep the sun out of your eyes.");
        }
        else if ((temperature > 50) || sunCondition == "Overcast"){
            System.out.println("This is a cool day, be sure to wear warm clothes");
        }
        else {
            System.out.println("Looks like a cold day, wear a sweater.");
        }

        System.out.println("The program is ending");
    }
}
