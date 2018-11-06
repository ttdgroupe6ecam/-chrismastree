/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 *
 * @author MediaMonster
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    
    //Attention il manque comment ajouetr plusier decoration et la gestion de decoratorPossible
    Scanner scan = new Scanner(System.in);
    static String choiceTree;
    
    public static void treeDecoration(ChrismasTree chrismasTree){
        Scanner scan = new Scanner(System.in);
        Decorator decoration= null;
        Decorator manyDecoration= null;
        String GarlandOption;
        String choiceDecoration;
        
        //Decorator Options
        System.out.println("Decorator Options: ");
        System.out.println("a: Balls");
        System.out.println("b: Garland");
        if (choiceTree.equals("a"))System.out.println("c: Candle");
        System.out.println("q: Quit");
 
        do {
            System.out.println("Choose a decoration please: ");
            choiceDecoration = scan.next();
            
            switch (choiceDecoration) {
                case "a":
                    if (manyDecoration==null){
                        decoration=new Balls (chrismasTree);
                        manyDecoration=decoration;
                    }
                    else{
                       decoration=new Balls(manyDecoration);  
                    }
                       
                    // display
                    System.out.println(decoration.toString());
                    break;

                case "b":
                    System.out.println("Garland Options: ");
                    System.out.println("a: Electric Garland");
                    System.out.println("b: Synthetic Garland");
                    System.out.println("q: Finish");

                    do{
                            System.out.println("Choose a Garland decorations options : ");
                            GarlandOption = scan.next();

                            switch (GarlandOption) {
                                case "a":
                                     //d=new ElectricGarland(chrismasTree);
                                     
                                    if (manyDecoration==null){
                                        decoration=new ElectricGarland (chrismasTree);
                                        manyDecoration=decoration;
                                    }
                                    else{
                                        decoration=new ElectricGarland(manyDecoration);  
                                    }
                                     
                                    // display
                                    System.out.println(decoration.toString());
                                    break;

                                case "b":
                                    //d=new SyntheticGarland(chrismasTree);
                                    
                                    if (manyDecoration==null){
                                        decoration=new SyntheticGarland (chrismasTree);
                                        manyDecoration=decoration;
                                    }
                                    else{
                                        decoration=new SyntheticGarland(manyDecoration);  
                                    }
                                    
                                    // dispaly
                                    System.out.println(decoration.toString());       
                                    break;

                            } // end of switch
                        } while (!GarlandOption.equals("q")); // end of loop

                case "c":
                    //d=new Candle(chrismasTree);
                    if (manyDecoration==null){
                        decoration=new Candle (chrismasTree);
                        manyDecoration=decoration;
                    }
                    else{
                        decoration=new Candle(manyDecoration);  
                    }
                    
                    
                    // dispaly
                    System.out.println(decoration.toString());       
                    break;

            } // end of switch
        } while (!choiceDecoration.equals("q")); // end of loop
         
        
    }
    
     public static void treeDecorationPersonalized(ChrismasTree chrismasTree){
        Scanner scan = new Scanner(System.in);
        Decorator decoration= null;
        Decorator manyDecoration= null;
        String GarlandOption;
        String choiceDecoration;
        
 
        do {
            
            //Decorator Options
            System.out.println("Decorator Options: ");
            System.out.println("a: Balls");
            System.out.println("b: Garland");
            if (choiceTree.equals("a"))System.out.println("c: Candle");
            System.out.println("q: Quit");
            System.out.println("Choose a decoration please: ");
            choiceDecoration = scan.next();
            
            //Decorator data(description)
            System.out.println("description: ");
            String description = scan.next();

            System.out.println("price: ");
            double price = scan.nextDouble();

            System.out.println("color: ");
            String color = scan.next();

            switch (choiceDecoration) {
                case "a"://Balls
                    
                    System.out.println("material: ");
                    String material = scan.next();

                    System.out.println("size: ");
                    String size = scan.next();
                    
                    if (manyDecoration==null){
                        decoration=new Balls(color,description , price,  material,  size, chrismasTree);
                        manyDecoration=decoration;
                    }
                    else{
                       decoration=new Balls(color,description , price,  material,  size, chrismasTree);  
                    }
                       
                    // display
                    System.out.println(decoration.toString());
                    break;

                case "b"://Garland
                    System.out.println("Garland Options: ");
                    System.out.println("a: Electric Garland");
                    System.out.println("b: Synthetic Garland");
                    System.out.println("q: Finish");

                    do{
                            System.out.println("Choose a Garland decorations options : ");
                            GarlandOption = scan.next();
                            
                            System.out.println("length : ");
                            double GarlandLength = scan.nextInt();
                            
                            switch (GarlandOption) {
                                
                                case "a"://Electric Garland
                                    
                                    System.out.println("hasBlink true or false : ");
                                    boolean hasBlink = scan.nextBoolean();
                                    if (manyDecoration==null){
                                        decoration=new ElectricGarland( color, description , price, hasBlink, GarlandLength,  chrismasTree);
                                        manyDecoration=decoration;
                                    }
                                    else{
                                        decoration=new ElectricGarland( color, description , price, hasBlink, GarlandLength,  chrismasTree) ; 
                                    }
                                     
                                    // display
                                    System.out.println(decoration.toString());
                                    break;

                                case "b"://Synthetic Garland
                                    System.out.println("paillette : ");
                                    String paillette = scan.next();
                                    
                                    
                                    if (manyDecoration==null){
                                        decoration=new SyntheticGarland( paillette,  color,  description,  price, GarlandLength , chrismasTree);
                                        manyDecoration=decoration;
                                    }
                                    else{
                                        decoration=new SyntheticGarland( paillette,  color,  description,  price, GarlandLength , chrismasTree); 
                                    }
                                    
                                    // dispaly
                                    System.out.println(decoration.toString());       
                                    break;

                            } // end of switch
                        } while (!GarlandOption.equals("q")); // end of loop

                case "c":
                    System.out.println("LifeTime : ");
                    int lifeTime = scan.nextInt();
                    
                    System.out.println("Parfum : ");
                    String parfum = scan.next();
                    
                    if (manyDecoration==null){
                        decoration=new Candle(color, description , price, lifeTime,  parfum,  chrismasTree);
                        manyDecoration=decoration;
                    }
                    else{
                        decoration=new Candle(color, description , price, lifeTime,  parfum,  chrismasTree); 
                    }
                    
                    
                    // dispaly
                    System.out.println(decoration.toString());       
                    break;

            } // end of switch
        } while (!choiceDecoration.equals("q")); // end of loop
         
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        
        Scanner scan = new Scanner(System.in);
        
        
        
        ChrismasTree tree;
        
        do {
            //Menu of Command Options
            System.out.println("Command Options: ");
            System.out.println("a: Natural tree");
            System.out.println("b: Artificial tree");
            System.out.println("q: Finish ");
            
            System.out.println("Choose an option please: ");
            //read the choice 
            choiceTree = scan.next();
            
            //Menu to choose type ommand (tree) personalized or standard
            System.out.println("Command zzz: ");
            System.out.println("1: Standard");
            System.out.println("2: personalized");
            System.out.println("q: Finish ");
            
            System.out.println("Choose type of command: ");
            //read the choice 
            String commandType = scan.next();
            
            switch (commandType) {
                
                case "1":
                    switch (choiceTree) {
                    case "a":
                        tree = new NaturalTree();
                        treeDecoration(tree);
                        break;

                    case "b":
                        tree = new ArtificialTree();
                        treeDecoration(tree);
                        break;

                    } // end of switch
                case "2":
                    switch (choiceTree) {
                    case "a":
                        tree = new NaturalTree();
                        treeDecorationPersonalized(tree);
                        break;

                    case "b":
                        tree = new ArtificialTree();
                        treeDecorationPersonalized(tree);
                        break;

                    } // end of switch
            }
        } while (!choiceTree.equals("q")); // end of loop  
         
     
     /*//manyDecoration
     String tab[]={"Balls","Garland","decoration"};
     //for(int i=0;i<tab.length-1;i++)
      String x="Balls";
      //ChrismasTree n=(ChrismasTree)x;
    // Balls t=(Balls) Class.forName("Balls").newInstance(); 

        Class clazz = Class.forName("christmasTree.Balls");
        Constructor c=clazz.getConstructor(null);
        Object t = c.newInstance();
     //ChrismasTree decoration=new ArtificialTree();
     //ChrismasTree d= new Balls(new Balls(new Balls(new Garland(new Balls(decoration)))));
     */
     
     //System.out.println(" "+t.getDescription());    
     
    }
    
    
}
