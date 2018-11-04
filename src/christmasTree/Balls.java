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
    int radius;
    
    public Balls(ChrismasTree treeDecorator) {
        super(treeDecorator);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public ChrismasTree getTreeDecorator() {
        return treeDecorator;
    }

    public void setTreeDecorator(ChrismasTree treeDecorator) {
        this.treeDecorator = treeDecorator;
    }   
    
}
