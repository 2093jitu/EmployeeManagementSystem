
package EmployeeAttendence;

public class TakeDetail {   
    
    public String employeeName;
    public String employeeInTime;
    public String employeeSignaser;
    
    void TakeDetail(String employeeName,String employeeInTime,String employeeSignaser){
    
        this.employeeName=employeeName;
        this.employeeInTime=employeeInTime;
        this.employeeSignaser=employeeSignaser;
    
    
    }
    
    void desplay(){
    
    System.out.print(employeeName);
    
    }
    
}
