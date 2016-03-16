/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Akash.ArtificialIntelligence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sonu
 */
public class CommandDatabase {
    public static void createDB(String speak,String path) throws IOException
    {
    
     try {
        BufferedWriter out = new BufferedWriter(new FileWriter("C://JARVIS//Database//"+speak+".txt"));
        out.write(path);
        out.close();
        } 
    catch (IOException e) 
    { 
       System.out.println("Exception ");
    }



        }
}
