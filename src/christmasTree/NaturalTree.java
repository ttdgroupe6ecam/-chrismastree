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
public class NaturalTree extends ChrismasTree {
    
    String treeType;
    int lifeTime;
    
    //Constructs
    public NaturalTree() {
        setDescription("Natural Tree");
        setPrice(200.20);
        setColor("Green");
    }
     
    public NaturalTree(String description,  double price,String color,String treeType, int lifeTime ) {
        setDescription(description);
        setPrice(price);
        setColor(color);
        this.treeType = treeType;
        this.lifeTime = lifeTime;
    }

    // Getters and Setters
    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        super.toString();
        return " NaturalTree{" + "treeType=" + treeType + ", lifeTime=" + lifeTime + '}';
    }
    
    
    
    
 
    
    
}
