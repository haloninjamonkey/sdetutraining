package basics;

/**
 * Created by patrick.duff on 9/28/2018.
 */
public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "the Lord of the Rings";

        if (bookTitle.contains(wordChoice)) {
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("The browser is Chrome");
        }

        String firstName = "Patrick";
        String lastName = "Duff";
        String SSN = "123456789";

        //Print initials and last 4
        System.out.println(firstName.substring(0, 1) + "" + lastName.substring(0,1) + " " + SSN.substring(5));
    }
}
