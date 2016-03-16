/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Akash.ArtificialIntelligence;

import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Sonu
 */
public class Execute {
    
   public static void main (String args[])throws IOException
   {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter");
       String s=in.readLine();
       read(s);
   }
    static void read(String filename)
    {   
        Process p=null;
       try{
 
	         DataInputStream dis = 
		    new DataInputStream (
		    	 new FileInputStream ("C://JARVIS//Database//"+filename+".txt"));

		 byte[] datainBytes = new byte[dis.available()];
		 dis.readFully(datainBytes);
		 dis.close();
 
		 String content = new String(datainBytes, 0, datainBytes.length);
                 
		 System.out.println(content);
 
                p = Runtime.getRuntime().exec(content);
                  p = Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
	}catch(Exception ex){
		ex.printStackTrace();
	} 
    }
    
}
