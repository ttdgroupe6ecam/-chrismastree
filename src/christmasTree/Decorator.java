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
public abstract class Decorator implements ChrismasTree{
    
    protected ChrismasTree treeDecorator;
    protected String description;
    protected double price;
    
    public Decorator (ChrismasTree treeDecorator)
    {
        this.treeDecorator = treeDecorator;
    } 
    
}
