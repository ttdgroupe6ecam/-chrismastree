/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

import java.util.ArrayList;

/**
 *
 * @author MediaMonster
 */
public class ArtificialTree extends ChrismasTree {
     
    private  String  plasticType;
    
    //constructs
    public ArtificialTree() {
        setDescription("Artificial Tree");
        setPrice(100.99);
        setColor("Green");
        this.plasticType="plasticType";
    }
    
    public ArtificialTree( String description,  double price,String color, String plasticType){
        setDescription(description);
        setPrice(price);
        setColor(color);
        this.plasticType=plasticType;  
    }
    
    //Attention à faire 
    public ArrayList decoratorPossible(){
        ArrayList a;
        return a;
    }
    //Getters and Setters
    public String getPlasticType() {
        return plasticType;
    }

    public void setPlasticType(String plasticType) {
        this.plasticType = plasticType;
    }
    
    @Override
    public String toString() {
        super.toString();
        return " ArtificialTree{" + "plasticType=" + plasticType + '}';
    }
    
   
    
    
}
