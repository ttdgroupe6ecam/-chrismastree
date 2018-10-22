/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorsapin;

/**
 *
 * @author MediaMonster
 */
public class Balls extends Decorator {
    
    public Balls(ChrismasTree treeDecorator) {
        super(treeDecorator);
    }

    @Override
    public String getDescription() {
        return treeDecorator.getDescription()+ " with Balls "; 
    }

    @Override
    public double getPrice() {
        return 50+treeDecorator.getPrice();
    }
    
}
