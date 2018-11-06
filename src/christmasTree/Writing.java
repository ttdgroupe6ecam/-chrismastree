/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author venon arthur
 */
public class Writing {
    private String path;
    private boolean append_to_file = true;
    
    public void Writing() throws IOException {
    FileWriter write = new FileWriter(path, true);
    BufferedWriter bufferWrite = new BufferedWriter(write);
    }
}