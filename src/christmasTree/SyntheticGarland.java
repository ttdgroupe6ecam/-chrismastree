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
public class SyntheticGarland extends Garland {
    
    private String paillette;

    //Construct
    public SyntheticGarland(ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" SyntheticGarland:yellow");
        setDescription(treeDecorator.getDescription()+" SyntheticGarland");
        setPrice(treeDecorator.getPrice()+10.99);
        setPaillette("Square");
    }

    public SyntheticGarland(String paillette, String color, String description, double price, double length, ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" "+color);
        setDescription(treeDecorator.getDescription()+" "+description);
        setPrice(treeDecorator.getPrice()+price);
        setLength(length);
        this.paillette = paillette;
    }
      
   
    //Getters and setters
    public String getPaillette() {
        return paillette;
    }

    public void setPaillette(String paillette) {
        this.paillette = paillette;
    }

    @Override
    public String toString() {
        return super.toString()+" SyntheticGarland{" + "paillette=" + paillette + '}';
    }
    
    
    
}
