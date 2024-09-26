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

    }
}
