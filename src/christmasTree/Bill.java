/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * @author venon arthur
 *     <p>This class's purpose is to save a command of a christmas tree in the format of a billing
 *     where client's info, the tree, it's elements and their prices and the total price is present
 */
public class Bill {

  private FileWriter wr = null;
  private BufferedWriter bf = null;
  private PrintWriter pf = null;
  private ChrismasTree toBePrinted;
  private Order order;
  // private String[] elements;
  /**
   * @param toBePrinted the class whiwch contains all info needed to make the file
   * @param order the class which contains the info about the client and the order
   * @param path the path to the file's location
   * @throws IOException this is in case the file cannot be created
   *     <p>This method is the constructor which instantiates the file, buffer and print writer to
   *     write in a file located in the specified path
   */
  public Bill(ChrismasTree toBePrinted, Order order, String path) throws IOException {

    FileWriter wr = new FileWriter(path, true);
    BufferedWriter bf = new BufferedWriter(wr);
    PrintWriter pf = new PrintWriter(bf);
    this.toBePrinted = toBePrinted;
    this.order = order;
  }
  /**
   * @throws IOException this is used in case the buffer and writer are already closed
   *     <p>this method closes the writer, buffer and printer so ressources used are released
   */
  public void close() throws IOException {

    this.pf.close();
    this.bf.close();
    this.wr.close();
  }
  /**
   * @param newString the string to be added in the file
   *     <p>this method adds the string in the parameters directly inside the file
   */
  public void addString(String newString) {
    pf.print(newString);
  }
  /**
   * @param newString this string is to be added in the file
   *     <p>this methods adds ths stirng in the parameters and then goes to the next lien
   */
  public void addStringLine(String newString) {
    pf.println(newString);
  }
  /** this methods adds the client's info */

  public void addClient() {
    addStringLine("surname : " + order.getSurname() + " name : " + order.getName());
    addStringLine("address : " + order.getDeliveryAddress());
    addStringLine("date : " + order.getDate());
    addStringLine("");
  }
  /**
   * @param treeType the type of the tree commanded
   * @param treeColor the color of the tree commanded
   *     <p>this method adds the tree's info in the file
   */
  public void addTree(String treeType, String treeColor) {
    addStringLine("1x " + treeType + " " + treeColor);
  }
  /**
   * @param description the array of the types of decoration
   * @param color the array of the color of decoration
   *     <p>this method adds the decorations in the file
   */

  public void addDecorator(String[] description, String[] color) {
    int i = 1;
    while (i < description.length) {
      addStringLine("1x " + description[i] + " " + color[i]);
    }
  }
  /** this method adds the price in the file */
  public void addPrice() {
    addStringLine("      ¨Price : " + String.valueOf(this.toBePrinted.getPrice()));
  }
  /** this methods adds the title in the file */
  public void addTitle() {
    addStringLine("A new command");
    addStringLine("");
    addStringLine("");
  }
  /**
   * @return elementsList the array of descitption on tree dans decoration
   *     <p>this method parse the descritpion of the description
   */
  public String[] parserDescription() {
    String tampon = this.toBePrinted.getDescription();
    tampon = stringReplacer(tampon, "TreeDescritpion: ");
    tampon = stringReplacer(tampon, "BallsDecorator: ");
    tampon = stringReplacer(tampon, "CandleDecorator: ");
    String[] elementsList = tampon.split(" ");
    return elementsList;
  }
  /**
   * @return elementsList the array of the colors of tree and decorations
   *     <p>this methods parses the color string
   */
  public String[] parserColor() {
    String tampon = this.toBePrinted.getColor();
    tampon = stringReplacer(tampon, "TreeColor: ");
    tampon = stringReplacer(tampon, "BallsColor: ");
    tampon = stringReplacer(tampon, "CandleColor: ");
    String[] elementsList = tampon.split(" ");
    return elementsList;
  }
  /**
   * @param toBeCut the string to have replacment
   * @param change the string to be suppressed
   * @return the new string
   *     <p>this methods supress parts of a string
   */
  public String stringReplacer(String toBeCut, String change) {
    return toBeCut.replace(change, "");
  }
  /** @throws IOException this method adds all the elements in the file */
  public void print() throws IOException {
    addTitle();
    addClient();
    String[] description = parserDescription();
    String[] color = parserColor();
    addTree(description[0], color[0]);
    addDecorator(description, color);
    addPrice();
    close();
  }
}
