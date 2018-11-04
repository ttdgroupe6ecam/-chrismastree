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
    
    private double length;//en cm
    
    //Construct
    public Garland(ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" GarlandClor:blue");
        setDescription(treeDecorator.getDescription()+" Garland");
        setPrice(treeDecorator.getPrice()+12.99);
        setLength(100);
    }

    public Garland(String color,String description ,double price,double length, ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(getColor()+"GarlandColor: "+color);
        setDescription(treeDecorator.getDescription()+" "+description);
        setPrice(treeDecorator.getPrice()+price);
        this.length = length;
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
