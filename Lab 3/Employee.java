import java.util.*;

 class Employee_Details{
    Scanner sc=new Scanner(System.in);
    int Employee_id;
    String Name;
    String Designation;
    int Salary;

    public void getEmployeeDetail(){
        System.out.println("Enter Employee id :");
        Employee_id=sc.nextInt();

        System.out.println("Enter Employee Name :");
        Name=sc.nextLine();
        
        System.out.println("Enter Employee's Designation :");
        Designation=sc.nextLine();

        System.out.println("Enter Employee's Salary");
        Salary=sc.nextInt();
    }

    public void printEmployeeDetail(){
        System.out.println("Employee id :"+Employee_id);
        System.out.println("Employee Nmae :"+Name);
        System.out.println("Employee's Designation :"+Designation);
        System.out.println("Employee's Salary :"+Salary);
    }
    
}

public class Employee {
    public static void main(String[] args) {

        Employee_Details ED = new Employee_Details();

        ED.getEmployeeDetail();
        ED.printEmployeeDetail();
    }
}
