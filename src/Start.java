import java.util.Scanner;
import java.io.*;

public class Start {

    public static void title() {
        System.out.println("       _               _ _      ");
        System.out.println("      | |             | | |     ");
        System.out.println("      | | __ _ _ __ __| | | ___ ");
        System.out.println("  _   | |/ _` | '__/ _` | |/ _ ");
        System.out.println(" | |__| | (_| | | | (_| | |  __/");
        System.out.println("  \\____/ \\__,_|_|  \\__,_|_|\\___|");
    }

    // TODO: add a delay before printing next instruction
    public static void printInstructions() {
        System.out.println("Welcome to Jardle! \n");
        System.out.println("The task is to guess the five letter word within six tries.");
        System.out.println("The guesssed letters will be either grey, yellow, or green.");
        System.out.println("Green letters are in the correct position.");
        System.out.println("Yellow letters are in the word, but in the wrong place.");
        System.out.println("Grey letters are not located within the word.");
        System.out.println("After solving each word, follow the directions to choose the next room and monster to defeat!");
        System.out.println("Failing to solve the word in six tries means you lose (and start over)!");
        System.out.println("GOOD LUCK! \n");
    }

    //clear screen after title and instructions print
    public static void clearRules() {
        Scanner clear = new Scanner(System.in);
        System.out.println("Press any key and hit enter to clear rules");

        String input = clear.nextLine();
        System.out.println(System.lineSeparator().repeat(50));

    }


    // TODO: hit any key to start new game
    static void newGame() {
        Game.enterDungeon();
    }
}
