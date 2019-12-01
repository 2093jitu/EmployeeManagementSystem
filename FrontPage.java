
package EmployeeAttendence;

import java.util.Scanner;

public class FrontPage {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Id number = ");
        
        try{
        char  idNumber=input.next().charAt(0);    
        switch(idNumber){
            
        case '1':
        TakeDetail detail=new TakeDetail();
        System.out.print("Enter Employee Name = ");
        String employeeName =input.next();
        
        System.out.print("Enter TIme = ");
        String employeeTime =input.next();
        
        System.out.print("Enter Employee Sinnacher = ");
        String employeeSignacher =input.next();
        
        detail.TakeDetail(employeeName,employeeTime,employeeSignacher);
        detail.desplay();
        break;
        default:
	System.out.println("no id number faound");
            
        }
        
        
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    
    }
    
}
