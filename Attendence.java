
package EmployeeAttendence;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class Attendence {    
    // variable
    String id,fName,lName,time,attendenceStatus;
    
    Scanner input = new Scanner (System.in);
            // create a file class object
            File dir =new File("AttendenceShit");
            // diclere gobal path.
            String path= dir.getAbsolutePath();
    
            // method for create file and write
        void  makeDir() throws FileNotFoundException{
            
            File dir =new File("AttendenceShit");            
            String path= dir.getAbsolutePath();
            File file= new File(path+"/Attendence.txt");
                        
                    dir.mkdir();
                    
        try{
            
            file.createNewFile();
            
            }catch(Exception e){
            
            System.out.println(e);
        
        }      
        
        //input   
        
        
        try (Formatter formatter = new Formatter(path+"/Attendence.txt")) {
            System.out.print("How many Employee Attendence Infoemation You wont to add = ");
            int num=input.nextInt();
            
            for(int i=1;i<=num;i++){                
                System.out.println("***Enter Employee Details***");
                System.out.print("Id= ");
                    id=input.next();
                
                System.out.print("FastName= ");                
                    fName=input.next();
                    
                System.out.print("LastName= ");                
                    lName=input.next();
                
                System.out.print("Time = ");
                    time=input.next();
                
                System.out.print("AttendencStatus= ");
                attendenceStatus=input.next();
                
                
                formatter.format("%s %s %s %s %s\r\n",id,fName,lName,time,attendenceStatus);
                
            }
        }
        
        
    }
    
    void printAttendence(){
        
    try{
    
        
      File  file = new File(path+"/Attendence.txt");
       Scanner scanner = new Scanner (file);
       
       while(scanner.hasNext()){
       
           String id=scanner.next();
           String fName=scanner.next();
           String lName=scanner.next();
           String time=scanner.next();
           String attendenceStatus=scanner.next();
           
           System.out.println("id:= "+id+" Name:= "+fName+" "+lName+" InTime:= "+time+" AttendenceStatus:= "+attendenceStatus);
       }
    
    }catch(Exception e){
    
        System.out.println(e);
    
    
    }
    
    
    
    
    }
    
    }
        
    
      


