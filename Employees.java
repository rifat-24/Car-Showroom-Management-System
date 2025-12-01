import java.util.Scanner;

public class Employees extends Showroom implements utility {
    String EmployeeId;
    String EmployeeName;
    int EmployeeAge;
    Scanner sc = new Scanner(System.in);
     @Override
     public void set_detailes(){
       System.out.print("EMPLOYEE ID: ");
       EmployeeId = sc.nextLine();
       // System.out.println();
        System.out.print("EMPLOYEE Name: ");
        EmployeeName = sc.nextLine();
        System.out.print("EMPLOYEE Age: ");
        EmployeeAge = sc.nextInt();
        
    }
     @Override
     public void get_detailes() {
        System.out.println("ID: "+EmployeeId);
        System.out.println("Name: "+EmployeeName);
        System.out.println("Age: "+EmployeeAge);

    }

}
