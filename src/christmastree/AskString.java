
package christmastree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

    public int ask(String message) {
        out.println(message);
        return scanner.nextLine();
    }

}