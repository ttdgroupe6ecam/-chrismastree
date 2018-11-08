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
public class ElectricGarland extends Garland {
    
    private boolean hasBlink;

    //Construct
    public ElectricGarland(ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" ElectricGarland:white");
        setDescription(treeDecorator.getDescription()+" ElectricGarland");
        setPrice(treeDecorator.getPrice()+36.99);
        setHasBlink(true);
        
    }

    public ElectricGarland(String color,String description ,double price,boolean hasBlink,double length, ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" "+color);
        setDescription(treeDecorator.getDescription()+" "+description);
        setPrice(treeDecorator.getPrice()+price);
        setLength(length);
        this.hasBlink = hasBlink;
    }
      
    //Getters and setters

    public boolean isHasBlink() {
        return hasBlink;
    }

    public void setHasBlink(boolean hasBlink) {
        this.hasBlink = hasBlink;
    }

    @Override
    public String toString() {
        return super.toString()+" ElectricGarland{" + "hasBlink=" + hasBlink + '}';
    }
    

    
    
    
}
