/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingcentersystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class FileMangerBinary implements Serializable{
    
    public boolean writeBinary(String FilePath , Object data)
    {
        try{
            System.out.print("\nwritting in ! " + FilePath);
            ObjectOutputStream writter = new ObjectOutputStream(new FileOutputStream(FilePath));
            writter.writeObject(data);
            System.out.println(" ... Done ! ");
            return true;
        }
        catch(IOException em){
            System.out.println("Error in Writting : "+em);
        }
        return false;
    }
    
    public Object readBinary(String FilePath)
    {
        Object result = null;
        try{
            System.out.println("Reading ! From " + FilePath);
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(FilePath));
            result = reader.readObject();
        }
        catch(FileNotFoundException e){
             System.out.println("Error in Reading by Youssef : "+e);
        } catch (IOException ex) {
            Logger.getLogger(FileMangerBinary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileMangerBinary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
