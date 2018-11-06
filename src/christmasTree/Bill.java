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
    
    public void Bill (String path)throws IOException {
        
        FileWriter write = new FileWriter(path,true);
        BufferedWriter buffer =new BufferedWriter(write);
        PrintWriter printer = new PrintWriter(buffer);
    }
    
    public void close(FileWriter write,BufferedWriter buffer,
            PrintWriter printer )throws IOException{
        
        printer.close();
        buffer.close();
        write.close();
    }
}
