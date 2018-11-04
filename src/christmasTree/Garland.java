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
        return "Garland{" + "length=" + length + '}';
    }

    
     
    
}
