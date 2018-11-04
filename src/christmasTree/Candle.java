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
public class Candle extends Decorator {
    
    private int lifeTime;
    private String parfum;
    
    //Construct
    public Candle(ChrismasTree treeDecorator) {
        super(treeDecorator);
    }
    
    //Getters and Setters

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public String getParfum() {
        return parfum;
    }

    public void setParfum(String parfum) {
        this.parfum = parfum;
    }
    
}
