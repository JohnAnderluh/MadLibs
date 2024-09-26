import java.util.Scanner;

/*
* Project 1.2.10
*/
public class MadLibs {
    public static void main(String[] args) {
        // creates a scanner to process terminal input
        Scanner sc = new Scanner(System.in);

        // prompts the user so they know when
        // to enter keyboard input within a program
        System.out.println("Enter your name: ");

        // nextLine method returns all keyboard input
        // until the user presses the Return or Enter key
        String userInput = sc.nextLine();

        // after collecting input, you can treat user input
        // as a normal String value
        System.out.println("Hello " + userInput);

        /*
         * I went to the animal <noun>, the <plural_noun> and the <number> beasts were
         * there.;
         * Once upon a time in a <adjective> land, a <noun> <adverb> grew.;
         * I wanted to eat a <noun> but the <adjective><noun> chased me away.;
         */

    }
}
