/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author venon arthur
 */
public class Bill {
    
    public void Bill (String path) {
        try {
        FileWriter write = new FileWriter(path,true);
        PrintWriter line = new PrintWriter(write);
        }catch (Exception e){}
    }
    
}
