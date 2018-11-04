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
        return "SyntheticGarland{" + "paillette=" + paillette + '}';
    }
    
    
    
}
