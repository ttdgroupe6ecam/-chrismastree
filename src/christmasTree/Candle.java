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
    
    private int lifeTime;//en heur
    private String parfum;
    
    //Construct
    public Candle(ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(getColor()+"CandleColor: white");
        setDescription(treeDecorator.getDescription()+" Candle");
        setPrice(treeDecorator.getPrice()+10.99);
        setLifeTime(5);
        setParfum("Senteurs d'inspiration");
    }

    public Candle(String color,String description ,double price,int lifeTime, String parfum, ChrismasTree treeDecorator) {
        super(treeDecorator);
        setColor(treeDecorator.getColor()==null?" ":treeDecorator.getColor()+" "+color);
        setDescription(treeDecorator.getDescription()+" "+description);
        setPrice(treeDecorator.getPrice()+price);
        this.lifeTime = lifeTime;
        this.parfum = parfum;
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
