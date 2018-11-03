/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

/**
 *
 * @author MediaMonster
 */
public class WoodTree implements ChrismasTree {
    
    private  String description;
    private  double price;
 
    @Override
    public String getDescription() {
        return "Wood tree";
    }
    
    @Override
    public double getPrice() {
        return 420.50;
    }
    
    
}
