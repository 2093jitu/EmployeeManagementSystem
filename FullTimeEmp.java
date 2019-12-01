
package EmployeeAttendence;

import java.util.Scanner;


public class FullTimeEmp extends Employee {
    float salary;
    
    
    public FullTimeEmp(){
    
        super();
        this.salary=0;
    
    }
    
    public FullTimeEmp(float salary,Name name,Date dob,String eid){
    
        super(name,dob,eid);
        this.salary=salary;
    
    }
    @Override
    public void input(){    
        Scanner in= new Scanner(System.in);
        System.out.println("Full Time Employee");
        super.input();
        System.out.println("Salary");
        salary=in.nextInt();
               
    }
    
    @Override
    public void print(){    
    System.out.println("Full time Employee");
    super.print();
    System.out.println("Salary "+salary);    
    }
    
    @Override
    public String toString(){   
    
        return "Full Time Employee ";
    
    }

}
