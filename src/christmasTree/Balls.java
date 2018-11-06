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
public class Balls extends Decorator {
 
    String material;
    String size;// in cm
    
    //Constructs
    public Balls(ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" BallsClor:Red ");
        setDescription(treeDecorator.getDescription()+" Balls");
        setPrice(treeDecorator.getPrice()+20.99);
        setMaterial("Plastic");
        setSize("Small");
    }

    public Balls(String color,String description ,double price, String material, String size, ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" "+color);
        setDescription(treeDecorator.getDescription()+" "+description);
        
        setPrice(treeDecorator.getPrice()+price);
        this.material = material;
        this.size = size;
    }

    //Getters and setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        
        return  super.toString()+ "Balls{" + "material=" + material + ", size=" + size + '}';
    }
  
    
}
