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
    //private String[] elements;
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
        addStringLine("surname : "+order.getSurname()+" name : "
                +order.getName());
        addStringLine("address : "+order.getDeliveryAddress());
    }
                
    public void addTree (String treeType,String treeColor) {
        addStringLine("1x "+treeType+" "+treeColor);
        
    }
    public void addDecorator (){
        
    }
 
    public String[] parserDescription () {
        String tampon=this.toBePrinted.getDescription();
        tampon = stringReplacer(tampon,"TreeDescritpion: ");
        tampon = stringReplacer(tampon, "BallsDecorator: ");
        tampon = stringReplacer(tampon,"CandleDecorator: ");     
        String[] elementsList = tampon.split(" ");
        return elementsList;
    }
    public String[] colorDescription () {
        String tampon=this.toBePrinted.getColor();
        tampon = stringReplacer(tampon,"TreeColor: ");
        tampon = stringReplacer(tampon, "BallsColor: ");
        tampon = stringReplacer(tampon,"CandleColor: ");     
        String[] elementsList = tampon.split(" ");
        return elementsList;
    }
    public String stringReplacer (String toBeCut, String change) {
        return toBeCut.replace(change,"");
    }
    public void add
    
}
