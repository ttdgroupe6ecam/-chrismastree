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
public abstract class ChrismasTree {
    private String description;
    private double price;

    //getters
    protected String getDescription() {
        return description;
    }

    protected double getPrice() {
        return price;
    }
    
    //setters
    protected void setDescription(String description) {
        this.description = description;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "ChrismasTree{" + "description=" + description + ", price=" + price + '}';
    }
   
    
    
}
