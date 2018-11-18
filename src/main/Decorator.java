/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmasTree;

/** @author MediaMonster
 * the class used to augment christmasTree
 */
public abstract class Decorator extends ChrismasTree {

  private ChrismasTree treeDecorator;

    /**
     *
     * @param treeDecorator the tree to be decorated
     * the constructor of the decorator.
     */
  public Decorator(ChrismasTree treeDecorator) {
    this.treeDecorator = treeDecorator;
  }

  // Getters and setters
  public ChrismasTree getTreeDecorator() {
    return treeDecorator;
  }

  public void setTreeDecorator(ChrismasTree treeDecorator) {
    this.treeDecorator = treeDecorator;
  }
}
