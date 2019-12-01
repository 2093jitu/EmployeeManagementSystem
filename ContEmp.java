
package EmployeeAttendence;

import java.util.Scanner;


public class ContEmp extends Employee {
     float hrate;
     int nh;
    
    public ContEmp(){    
    
    }
    
    public ContEmp(float hrate,int nh,Name name,Date dob,String eid){ 
        super(name,dob,eid);
        this.hrate=hrate;
        this.nh=nh;
    
    }
    
    @Override
    public void input(){    
        Scanner in= new Scanner(System.in);
        System.out.println("Contract Employee");
        super.input();
        System.out.println("H Rate : ");
        hrate=in.nextInt();
        System.out.println("Total hours : ");
        nh=in.nextInt();
               
    }
    
    @Override
    public void print(){    
    System.out.println("ContractEmployee");
    super.print();
    System.out.println("H rate "+hrate);
    System.out.println("Number of Hours "+nh);
    }
    
    @Override
    public String toString(){
    
        return "Contractor";
    
    }
    
    
}
