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
public class Garland extends Decorator {
    
    private double length;
    
    //Construct
    public Garland(ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor("Red");
        setDescription(treeDecorator.getDescription()+" Garland");
        setPrice(treeDecorator.getPrice()+12.99);
        setLength(40);
    }
    
    
     
    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString()+" Garland{" + "length=" + length + '}';
    }

    
     
    
}
