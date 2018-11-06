/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

import java.lang.reflect.Constructor;
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
            choiceDecoration = scan.nextLine();
            
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
                    System.out.println("a: ElectricGarland");
                    System.out.println("b: SyntheticGarland");
                    System.out.println("q: Quit");

                    do{
                            System.out.println("Choose a Garland decorations options : ");
                            GarlandOption = scan.nextLine();

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
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        
        Scanner scan = new Scanner(System.in);
        
        
        
        ChrismasTree tree;
        
        //Command Options
        System.out.println("Command Options: ");
        System.out.println("a: Natural tree");
        System.out.println("b: Artificial tree");
        System.out.println("q: Quit");
        
        
        do {
            System.out.println("Choose an option please: ");
            choiceTree = scan.nextLine();
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
