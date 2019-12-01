
package EmployeeAttendence;

import java.util.Scanner;

public class Name {
    private String fn;
    private String mn;
    private String In;    
    
public Name(){

    this.fn="";
    this.mn="";
    this.In="";

}

public Name(String fn,String mn,String In){

    this.fn=fn;
    this.mn=mn;
    this.In=In;

}

public Name(Name n){

    this.fn=n.fn;
    this.mn=n.mn;
    this.In=n.In;

}

public String toString(){   
    
        return fn+" "+In+"\nMobile : "+mn;
    
    }
    
public void input(){
    
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Name");
            System.out.println("Fast: ");
            fn=in.next();            
            System.out.println("Last: ");
            In=in.next();
            System.out.println("Middle: ");
            mn=in.next();
    
    
    
    }


    


}
