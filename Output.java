
package EmployeeAttendence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Output {    
    public static void main (String args[]) throws FileNotFoundException{
       Scanner input = new Scanner (System.in);
       File file1 = new File("output");
       file1.mkdir(); 
       String path = dir.getAbsolutePath();
       file1 = new File(path+"employeeA.text");
        
        try{        
                      
               file1.createNewFile();
               System.out.println("file are created");       
           
               
        }catch(Exception e){
        
            System.out.print(e);
        
        }
        
        
        String id,name,date,address,salary;
        try{
        
           try (Formatter formatter = new Formatter(path+"employeeA.text")) {
               System.out.print("How many Employee Infoemation You wont to add  = ");
               int num=input.nextInt();
               for(int i=1;i<=num;i++){
                   
                   System.out.println("Enter Employee Details-----");
                   System.out.print("Id= ");
                   id=input.next();
                   System.out.print("Name= ");
                   
                   name=input.next();
                   
                   System.out.print("join Date= ");
                   date=input.next();
                   System.out.print("address= ");
                   address=input.next();
                   System.out.print("salary= ");
                   salary=input.next();
                   
                   formatter.format("%s %s %s %s %s\r\n",id,name,date,address,salary);
                   
               }
           }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
        
        }
        
    
    }
    
}
