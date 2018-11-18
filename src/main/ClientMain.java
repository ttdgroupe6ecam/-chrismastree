/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmasTree;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * this is the main class.
 * @author MediaMonster
 *
 */
public class ClientMain {


  // Attention il manque comment ajouetr plusier decoration et la gestion de decoratorPossible
  Scanner scan = new Scanner(System.in);

  static String choiceTree;

  /**
   * the order returned contains the client's info; the delivery adress and when it was done.
   * @return the order class
   *
   *
   */
  public static Order makeOrder() {

    Scanner scan = new Scanner(System.in);
    System.out.println("Client's name :");
    String name = scan.nextLine();
    System.out.println("Client's surname :");
    String surname = scan.nextLine();
    System.out.println("Client's adress :");
    String deliveryAdress = scan.nextLine();
    Order order = new Order(deliveryAdress, name, surname);
    return order;
  }

  /**
   * this class is used to choose which decoration to be added on the tree.
   * @param chrismasTree the christmastree to be augmented
   *
   *
   */
  public static void treeDecorationStandard(ChrismasTree chrismasTree) {
    Scanner scan = new Scanner(System.in);
    Decorator decoration;
    Decorator manyDecoration = null;



    // Decorator Options
    System.out.println("Decorator Options: ");
    System.out.println("a: Balls");
    System.out.println("b: Garland");
    if (choiceTree.equals("a")) {
      System.out.println("c: Candle");
    }
    System.out.println("q: Quit");
    String choiceDecoration;
    do {
      System.out.println("Choose a decoration please: ");
      choiceDecoration = scan.next();

      switch (choiceDecoration) {
        case "a":
        {
          if (manyDecoration == null) {
            decoration = new Balls(chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Balls(manyDecoration);
          }

          // display
          System.out.println(decoration.toString());
        }
          break;

        case "b":
        {
          System.out.println("Garland Options: ");
          System.out.println("a: Electric Garland");
          System.out.println("b: Synthetic Garland");
          System.out.println("q: Finish");
          String garlandOption;
          do {
            System.out.println("Choose a Garland decorations options : ");
            garlandOption = scan.next();

            switch (garlandOption) {
              case "a": {

                // d=new ElectricGarland(chrismasTree);

                if (manyDecoration == null) {
                  decoration = new ElectricGarland(chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration = new ElectricGarland(manyDecoration);
                }

                // display
                System.out.println(decoration.toString());
              }
                break;

              case "b":
              {
                // d=new SyntheticGarland(chrismasTree);

                if (manyDecoration == null) {
                  decoration = new SyntheticGarland(chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration = new SyntheticGarland(manyDecoration);
                }

                // dispaly
                System.out.println(decoration.toString());
              }
                break;
              default:
                break;
            } // end of switch
          } while (!garlandOption.equals("q")); // end of loop
        }
          break;

        case "c":
        {
          // d=new Candle(chrismasTree);
          if (manyDecoration == null) {
            decoration = new Candle(chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Candle(manyDecoration);
          }

          // dispaly
          System.out.println(decoration.toString());
        }
          break;

        default:
          break;
      } // end of switch
    } while (!choiceDecoration.equals("q")); // end of loop
  }

  /**
   * this class allows for choosing a personalized decoration.
   * @param chrismasTree the ree to be personalized
   */
  public static void treeDecorationPersonalized(ChrismasTree chrismasTree) {
    Scanner scan = new Scanner(System.in);
    Decorator decoration ;
    Decorator manyDecoration = null;
    String choiceDecoration;


    do {

      // Decorator Options
      System.out.println("Decorator Options: ");
      System.out.println("a: Balls");
      System.out.println("b: Garland");
      if (choiceTree.equals("a")) {
        System.out.println("c: Candle");
      }
      System.out.println("q: Quit");
      System.out.println("Choose a decoration please: ");
      choiceDecoration = scan.next();

      // Decorator data(description)
      System.out.println("description: ");
      String description = scan.next();

      System.out.println("price: ");
      double price = scan.nextDouble();

      System.out.println("color: ");
      String color = scan.next();

      switch (choiceDecoration) {
        case "a": /* Balls*/ {
          System.out.println("material: ");
          String material = scan.next();

          System.out.println("size: ");
          String size = scan.next();

          if (manyDecoration == null) {
            decoration = new Balls(color, description, price, material, size, chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Balls(color, description, price, material, size, chrismasTree);
          }

          // display
          System.out.println(decoration.toString());
        }
          break;

        case "b": /* Garland*/ {
          String garlandOption;
          do {
            System.out.println("Garland Options: ");
            System.out.println("a: Electric Garland");
            System.out.println("b: Synthetic Garland");
            System.out.println("q: Finish");
            System.out.println("Choose a Garland decorations options : ");
            garlandOption = scan.next();

            System.out.println("length : ");
            double garlandLength = scan.nextInt();

            switch (garlandOption) {
              case "a": // Electric Garland
                System.out.println("hasBlink true or false : ");
                boolean hasBlink = scan.nextBoolean();
                if (manyDecoration == null) {
                  decoration =
                      new ElectricGarland(
                          color, description, price, hasBlink, garlandLength, chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration =
                      new ElectricGarland(
                          color, description, price, hasBlink, garlandLength, chrismasTree);
                }

                // display
                System.out.println(decoration.toString());
                break;

              case "b": // Synthetic Garland
                System.out.println("paillette : ");
                String paillette = scan.next();

                if (manyDecoration == null) {
                  decoration =
                      new SyntheticGarland(
                          paillette, color, description, price, garlandLength, chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration =
                      new SyntheticGarland(
                          paillette, color, description, price, garlandLength, chrismasTree);
                }

                // dispaly
                System.out.println(decoration.toString());
                break;
              default:
                break;

            } // end of switch
          } while (!garlandOption.equals("q")); // end of loop
        }
            break;

        case "c": {
          System.out.println("LifeTime : ");
          int lifeTime = scan.nextInt();

          System.out.println("Parfum : ");
          String parfum = scan.next();

          if (manyDecoration == null) {
            decoration = new Candle(color, description, price, lifeTime, parfum, chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Candle(color, description, price, lifeTime, parfum, chrismasTree);
          }

          // dispaly
          System.out.println(decoration.toString());
        }
          break;
        default :
          break;
      } // end of switch
    } while (!choiceDecoration.equals("q")); // end of loop
  }

  /**
   * the class main to be used by the retailer.
   * @param args to be entered by the user
   * @throws IOException if a file can't be created
   */
  public static void main(String[] args) throws IOException {

    Scanner scan = new Scanner(System.in);
    Order order = makeOrder();

    ChrismasTree tree = null;

    do {
      // Menu of Command Options
      System.out.println("Command Options: ");
      System.out.println("a: Natural tree");
      System.out.println("b: Artificial tree");
      System.out.println("q: Finish ");

      System.out.println("Choose an option please: ");
      // read the choice
      choiceTree = scan.next();

      // Menu to choose type ommand (tree) personalized or standard
      System.out.println("Command zzz: ");
      System.out.println("1: Standard");
      System.out.println("2: personalized");
      System.out.println("q: Finish ");

      System.out.println("Choose type of command: ");
      // read the choice
      String commandType = scan.next();

      switch (commandType) {
        case "1": {
          switch (choiceTree) {
            case "a": {
              tree = new NaturalTree();
              treeDecorationStandard(tree);
            }
              break;

            case "b": {
              tree = new ArtificialTree();
              treeDecorationStandard(tree);
            }
              break;
            default:
              break;
          }
        }
            break;

        case "2":
        {
          switch (choiceTree) {
            case "a": {
              tree = new NaturalTree();
              treeDecorationPersonalized(tree);
            }
                break;

            case "b": {
              tree = new ArtificialTree();
              treeDecorationPersonalized(tree);
            }
              break;
            default:
              break;
          }
        }
          break;
        default:
          break;
      }

    } while (!choiceTree.equals("q")); // end of loop
    Bill bill = new Bill(tree, order, Paths.get(".").toAbsolutePath().normalize().toString());
    bill.print();

    /*//manyDecoration
         String tab[]={"Balls","Garland","decoration"};
         //for(int i=0;i<tab.length-1;i++)
          String x="Balls";
          //ChrismasTree n=(ChrismasTree)x;
        // Balls t=(Balls) Class.forName("Balls").newInstance();
    /*
            Class clazz = Class.forName("christmasTree.Balls");
            Constructor c=clazz.getConstructor(null);
            Object t = c.newInstance();
         //ChrismasTree decoration=new ArtificialTree();
         ChrismasTree d= new Balls(new Balls(new Balls(new Garland(new Balls(decoration)))));
        */

    // System.out.println(" "+t.getDescription());

  }
}
