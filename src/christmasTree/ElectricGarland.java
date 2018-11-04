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
