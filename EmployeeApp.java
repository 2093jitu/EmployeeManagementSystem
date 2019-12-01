
package EmployeeAttendence;
// modified

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeApp {
    //add Employee Array
     static Employee e[] =new Employee[100];     
     static int EmployeeCount;
    // Employee Attendence Arry
     
    // create a main manu
    public static void  mainMenu(){
    
        System.out.println("Employee Application");
        System.out.println("++++++++++++++++++++++");
        System.out.println("1. Add new Employee");
        System.out.println("2. Employee Attendence Sheet");
        System.out.println("3. Print Employee Attendence Sheet");
        System.out.println("4. print All");
        System.out.println("5. print given Employee");
        System.out.println("6. Exit");
    
    }
   // create a merhod to get manu optin 
    //read integer number 
    
    public static int getMenuOption(){
        int option;
        Scanner in= new Scanner (System.in);
        System.out.print("Enter your option:  ");
        option = in.nextInt();
        return option;
    
    }
    
    //crice a method to print all
    public static void printAll(){
    
        for(int i=0; i<EmployeeCount; i++){        
            e[i].print();        
        }
    
    }
    
    public static void printGiven()
        {
            // get eid 
            String EID;
            Scanner in= new Scanner (System.in);
            System.out.print("Enter EID:  ");            
            EID=in.nextLine();
            
            for(int i=0; i<EmployeeCount; i++){
              if(EID.equals(e[i].getNic())){
                  
                System.out.print("*** GIVEN EMPLOYEE DETAILS ***");
                e[i].print();
              
              
              }  
                
            
            
            }
            
        }
    
    public static void addNewEmployee(){
        int type=0;
        System.out.println("Employee TYpe");
        System.out.println("1- Full Emp , 2-Contactor");        
        type =getMenuOption();
        
        switch(type)
                {
                
            case 1://full
                e[EmployeeCount]=new FullTimeEmp();
                e[EmployeeCount].input();
                EmployeeCount++;
                
                break;
            case 2://Contactor
                e[EmployeeCount]=new ContEmp(); 
                e[EmployeeCount].input();
                EmployeeCount++;
                break;    
                
                }
    
    }
    
    public static void addAttendence(){        
       EmployeeAttendenceShit a= new EmployeeAttendenceShit();
       a.inputA();
       
        
    
    }
    
    
    //now add method to the min and create app
    public static void main(String []args) throws FileNotFoundException{
        EmployeeCount=0;
        Attendence b= new Attendence();
     //  main loop
        int op=0;
        do
        {
            //get manu
            mainMenu();
            // get manu option
            op=getMenuOption();
         switch (op)
         {
            case 1:// add
                 System.out.println("Add");
                 addNewEmployee();
            break;
            case 2:// add Attendence
                 System.out.println("Attendence Status");
                 b.makeDir();
            break;     
               
            case 3: //print
                 b.printAttendence();
                 System.out.println("Print Attendence Shit");           
                             
            break;
                
            case 4: 
                 System.out.println("Print All");
                 printAll(); 
            break;
                
            case 5: // print given
                 printGiven();
                 System.out.println("Print Given");
            break;            
             
            case 6: // exit
                 System.out.println("Thenks");
            break;
            default:
                 System.out.println("ERROR INPUT");
         
         }
        
        }while(op !=6);
        // exit after prase 4     
              
    }
}
