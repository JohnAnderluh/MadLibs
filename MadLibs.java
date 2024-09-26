import java.util.Scanner;

/*
* Project 1.2.10
*/
public class MadLibs {
    public static void main(String[] args) {
        // creates a scanner to process terminal input
        Scanner sc = new Scanner(System.in);
        // MadLibs Strings
        String madLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";

        // String madLib = "Once upon a time in a <adjective> land, a <noun> <adverb>
        // grew.";
        // String madLib = "I wanted to eat a <noun> but the <adjective><noun> chased me
        // away.";

        int openingBracketIndex = madLib.indexOf("<");
        int closingBracketIndex = madLib.indexOf(">");

        String MadLib1 = madLib.substring(openingBracketIndex + 1, closingBracketIndex);

        // prompts the user to enter the first word
        System.out.println("Enter a " + MadLib1);
        // stores entered noun
        String userInput1 = sc.nextLine();

        // prompts the user to enter the second word
        System.out.println("Enter a plural noun.");
        String userInput2 = sc.nextLine();

        // prompts the user to enter the third word
        System.out.println("Enter a number.");
        String userInput3 = sc.nextLine();

        // Output
        System.out.println(MadLib1Noun);

    }
}
