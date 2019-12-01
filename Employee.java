
package EmployeeAttendence;

import java.util.Scanner;
public class Employee {
    
    Name name;
    Date dob;
    String eid;
    
    public Employee(Name name,Date dob,String eid){
        
        this.name=new Name(name);
        this.dob=new Date(dob);
        this.eid=eid;
    
    }
    
    public Employee(){
        
        this.name=new Name();
        this.dob=new Date();
        this.eid="00000000v";
    
    }
    @Override
    public String toString(){   
    
        return "Employee"+name;
    
    }
    public void input(){
		
          Scanner in= new Scanner(System.in);
        System.out.println("*** Enter Employee information ***");
            name.input();
            dob.input();
        System.out.println("EID");
           eid=in.nextLine(); 
    
    
    }
    
    public void print(){
    
        System.out.println("Employee details");
        System.out.println("Name :"+name);
       // System.out.println("Mobile:"+mn);
        System.out.println("DoB :"+dob);
        System.out.println("EID :"+eid);
    
    }
    
    public String getNic(){
    
    return eid;
    }
     
    
}
