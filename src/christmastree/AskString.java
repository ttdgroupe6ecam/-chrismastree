
package christmastree;


import java.io.*;
import java.util.Scanner;

/**
 * This class's purpose is to save a command of a christmas tree in the format of a billing where,
 * client's info, the tree, it's elements and their prices and the total price is present.
 *
 * @author venon arthur
 */
public class AskString {

    private final Scanner scanner;
    private final PrintStream out;

    public AskString(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public String ask(String message) {
        out.println(message);
        return scanner.nextLine();
    }

}