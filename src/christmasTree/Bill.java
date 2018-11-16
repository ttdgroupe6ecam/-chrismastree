/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author venon arthur
 * 
 * This class's purpose is to save a command of a christmas tree in
 * the format of a billing where client's info, the tree, it's elements and 
 * their prices and the total price is present
 */
public class Bill {

    private FileWriter wr = null;
    private BufferedWriter bf = null;
    private PrintWriter pf = null;
    private Decorator toBePrinted;
    private Order order;
    /**
     * 
     * @param toBePrinted the class whiwch contains all info needed to make
     * the file
     * @param path the path to the file's location
     * @throws IOException this is in case the file cannot be created
     * 
     * This method is the constructor which instantiates the file, buffer and 
     * print writer to write in a file located in the specified path
     */
    public void Bill (Decorator toBePrinted,Order order,String path)throws 
            IOException {
        
        FileWriter wr = new FileWriter(path,true);
        BufferedWriter bf = new BufferedWriter(wr);
        PrintWriter pf = new PrintWriter(bf);
        this.toBePrinted = toBePrinted;
        this.order = order;
    }
    /**
     * 
     * @throws IOException this is used in case the buffer and writer are
     * already closed
     * 
     * this method closes the writer, buffer and printer so ressources used
     * are released
     */
    public void close()throws IOException {
        
        this.pf.close();
        this.bf.close();
        this.wr.close();
    }
    /**
     * 
     * @param newString the string to be added in the file
     * 
     * this method adds the string in the parameters directly inside the file
     */
    
    public void addString(String newString){
        pf.print(newString);
    }
    /**
     * 
     * @param newString this string is to be added in the file
     * 
     * this methods adds ths stirng in the parameters and then goes to the 
     * next lien
     */
    public void addStringLine(String newString){
        pf.println(newString);
    }
   public void addClient (){
        //TODO
    }
                
    public double addTree (elements[0]) {
        this.addStringLine("1x "+elements[0]+" "+
                this.toBePrinted.getColor()+" "+this.toBePrinted.getPrice());
        return this.toBePrinted.getPrice();//float ??
    }
    public void addDecorator (){
        
    }
 
    public String[] parser () {
        String tampon = this.toBePrinted.getDescription().replace("descritpion=", "");
        String[] elementsList = tampon.split(" ");
        return elementsList;
    }
}
