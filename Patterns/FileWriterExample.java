package Patterns;
import java.io.FileWriter;  


public class FileWriterExample
{  
    public static void main(String args[])
    {    
         try{    
        	 
           FileWriter fw=new FileWriter("C:Desktop\\testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }
         catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  