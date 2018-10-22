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
public class NaturalTree implements ChrismasTree {
    
    private  String description;
    private  double prix;
 
    @Override
    public String getDescription() {
        return  "Naturel tree";
    }
    
    @Override
    public double getPrice() {
        return 200.50;
    }
    
    
}
