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
        setColor(getColor()+" ElectricGarland:white");
        setDescription(treeDecorator.getDescription()+" ElectricGarland");
        setPrice(treeDecorator.getPrice()+10.99);
        setHasBlink(true);
        
    }

    public ElectricGarland(String color,String description ,double price,boolean hasBlink, ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(getColor()+" ElectricGarlandColor: "+color);
        setDescription(treeDecorator.getDescription()+" "+description);
        setPrice(treeDecorator.getPrice()+price);
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
        return "SyntheticGarland{" + "paillette=" + hasBlink + '}';
    }
    
    
    
}
