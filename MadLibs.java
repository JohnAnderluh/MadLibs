import java.util.Scanner;

/*
* Project 1.2.10
*/
public class MadLibs {
    public static void main(String[] args) {
        // creates a scanner to process terminal input
        Scanner sc = new Scanner(System.in);
        // MadLibs Strings
        // String madLib = "I went to the animal <noun>, the <plural noun> and the
        // <number> beasts were there.";
        // String madLib = "Once upon a time in a <adjective> land, a <noun> <adverb>
        // grew.";
        String madLib = "I wanted to eat a <noun> but the <adjective> <noun> chased me away.";

        // Indexes
        int openingBracketIndex = madLib.indexOf("<");
        int closingBracketIndex = madLib.indexOf(">");
        int openingBracketIndex2 = madLib.indexOf("<", openingBracketIndex + 1);
        int closingBracketIndex2 = madLib.indexOf(">", closingBracketIndex + 1);
        int openingBracketIndex3 = madLib.indexOf("<", openingBracketIndex2 + 1);
        int closingBracketIndex3 = madLib.indexOf(">", closingBracketIndex2 + 1);
        int totalLength = madLib.length();

        // declaring prompts (should they be capitalized?)
        String Prompt1 = madLib.substring(openingBracketIndex + 1, closingBracketIndex);
        String Prompt2 = madLib.substring(openingBracketIndex2 + 1, closingBracketIndex2);
        String Prompt3 = madLib.substring(openingBracketIndex3 + 1, closingBracketIndex3);

        // prompts the user to enter the first word
        System.out.println("Enter a " + Prompt1);
        // stores entered noun
        String userInput1 = sc.nextLine();

        // prompts the user to enter the second word
        System.out.println("Enter a " + Prompt2);
        String userInput2 = sc.nextLine();

        // prompts the user to enter the third word
        System.out.println("Enter a " + Prompt3);
        String userInput3 = sc.nextLine();

        // Output
        System.out.print(madLib.substring(0, openingBracketIndex) + userInput1);
        System.out.print(madLib.substring(closingBracketIndex + 1, openingBracketIndex2) + userInput2);
        System.out.print(madLib.substring(closingBracketIndex2 + 1, openingBracketIndex3) + userInput3);
        System.out.print(madLib.substring(closingBracketIndex3 + 1, totalLength));
    }
}
