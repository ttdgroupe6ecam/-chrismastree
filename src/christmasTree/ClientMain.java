/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

import java.util.Scanner;

/**
 *
 * @author MediaMonster
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    
    Scanner scan = new Scanner(System.in);
    
    public static void treeDecoration(ChrismasTree chrismasTree){
        /*Scanner scan = new Scanner(System.in);
        Decorator tree=null;
        Decorator d=null;
            
        
        
       /* 
        //Geek myGeek = new Geek("Geek");
        System.out.println("Decorator Options: ");
        System.out.println("a: Leds");
        System.out.println("b: Balls");
        System.out.println("q: Quit");
        
        //choice = scan.nextLine();
         String choiceDecoration=null;
        do {
            System.out.println("Choose a decoration please: ");
            choiceDecoration = scan.nextLine();
            switch (choiceDecoration) {
            case "a":
               /*  d=new Leds(chrismasTree);
                // afficher la description
                System.out.println(d.getDescription());
        
                 // afficher le prix
                System.out.println(d.getPrice());
                 break;*/
           /* case "b":
                d=new Balls(chrismasTree);
                // afficher la description
                System.out.println(d.getDescription());
        
                 // afficher le prix
                System.out.println(d.getPrice());
        
                 // afficher le prix
                System.out.println(chrismasTree.getPrice());
                break;
            
            
                
            } // end of switch
        } while (!choiceDecoration.equals("q")); // end of loop
         
         //****
         
        // return d;*/
    }
    
    public static void main(String[] args) {
        
        /*Scanner scan = new Scanner(System.in);
        
        String choiceTree = null;
        String choiceDecoration = null;
        
        ChrismasTree tree=null;
        
        //Geek myGeek = new Geek("Geek");
        System.out.println("Command Options: ");
        System.out.println("a: Natural tree");
        System.out.println("b: Artificial tree");
        System.out.println("c: Wood tree");
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
                
           /* case "c":
                tree = new WoodTree();
                treeDecoration(tree);
                break;*/
                
           // } // end of switch
     /*   } while (!choiceTree.equals("q")); // end of loop
        //sapain Artificiel avec boule 
         ChrismasTree decoration=(
            new Balls(
            new ArtificialTree()
            )
            );*/
         
     
     //test
     
     ChrismasTree decoration=new ArtificialTree();
     ChrismasTree d= new Garland(new Balls(decoration));
     
     
     System.out.println(" "+d.toString());      
     
    }
    
    
}
