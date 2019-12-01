
package EmployeeAttendence;

import java.util.Scanner;
public class Date {
     int day;
     int mon;
     int year;
    
    public Date(){
        
        this.day=0;
        this.mon=0;
        this.year=0;
    }
    
    public  Date(int day,int mon,int year){
    
        this.day=day;
        this.mon=mon;
        this.year=year;
    
    
    }
    
    public  Date(Date date){
    
        this.day=date.day;
        this.mon=date.mon;
        this.year=date.year;
    
    
    }
    
    @Override
    public String toString(){   
    
        return year+" . "+mon+" . "+day;
    
    }
    
    public void input(){
    
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Date");
            System.out.println("Year: ");
            year=in.nextInt();
            System.out.println("Month: ");
            mon=in.nextInt();
            System.out.println("Day: ");
            day=in.nextInt();
    
    
    
    }
    
    
    
}
