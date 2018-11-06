/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;
import java.util.ArrayList;

/**
 *
 * @author venon arthur
 */
public class FileWriter {
    private String path;
    private boolean append_to_file = true;
    
    public void WriteFile (String file_path,boolean append) {
        path = file_path;
        append_to_file = append;
                }
    
}
