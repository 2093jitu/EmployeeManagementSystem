
package EmployeeAttendence;

import java.util.Scanner;


public class EmployeeAttendenceShit{
    private    Name name;    
    private   String eid;
    private Date  dob;
    char attendence;
    
    public EmployeeAttendenceShit(Name name,Date dob,String eid,char attendence){
    
        this.name=new Name(name);
        this.dob=new Date(dob);
        this.eid=eid;
        this.attendence=attendence;
    
    }
    
    public EmployeeAttendenceShit(){
    
        this.name=new Name();
        this.dob=new Date();
        this.eid="00000000v";
        this.attendence=attendence;
    
    }
    
    public void inputA(){    
        Scanner in= new Scanner(System.in);
        System.out.println("*** Employee Attendence ***");        
        System.out.println("Enter Employee information");
            name.input();
            dob.input();
        System.out.println("EId");
            eid=in.nextLine(); 
        System.out.println("*** IF PRISENT ENTER = P ELSE ENTER = A ***");
        attendence=in.next().charAt(0);
        int count = 0;
        do{
            switch(attendence){
            
               case 'P':
                  
               break;
                   
               case 'A':
                printA();   
               break;
                   
               default:
               System.out.println("Wrong Input");
               
            
            }
        }while(count ==1);
               
    }
    
    
    public void printA(){    
    System.out.println("*** ALL EMPLOYEE ATTENDENCE ***");
    System.out.println("EID "+eid); 
    System.out.println("Attendence Ststus "+attendence);
    
    }
    
    @Override
    public String toString(){   
    
        return "ALL EMPLOYEE ";
    
    }
    
    //
    static EmployeeAttendenceShit a [] = new EmployeeAttendenceShit[100];
    static int attendenceCount;
    
}
