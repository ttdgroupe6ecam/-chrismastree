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
 */
public class Bill {

    private FileWriter wr = null;
    private BufferedWriter bf = null;
    private PrintWriter pf = null;
    private ChrismasTree toBePrinted;
    
    public void Bill (ChrismasTree toBePrinted,String path)throws IOException {
        
        FileWriter wr = new FileWriter(path,true);
        BufferedWriter bf = new BufferedWriter(wr);
        PrintWriter pf = new PrintWriter(bf);
        this.toBePrinted = toBePrinted;
    }
    
    public void close()throws IOException{
        
        this.pf.close();
        this.bf.close();
        this.pf.close();
    }
    
    public void addString(String newString){
        pf.print(newString);
    }
    
    public void addStringLine(String newString){
        pf.println(newString);
    }
    
    public void addClient (){
        this.toBePrinted.
    }
}
