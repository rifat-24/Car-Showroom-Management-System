import java.util.Scanner;

public class Showroom implements utility {
    String ShowroomName;
    String ShowroomAddress;
    String ManagerName;
    int TotalEmployees;
    int TotalCars;
@Override
public void set_detailes() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Showroom name");
    ShowroomName = sc.nextLine();
    System.out.print("Enter the Showroom address");
    ShowroomAddress = sc.nextLine();
    System.out.print("Enter the Manager name");
    ManagerName = sc.nextLine();
    System.out.print("Enter the Total Employee");
    TotalEmployees = sc.nextInt();
    System.out.print("Enter the toatal cars");
    TotalCars = sc.nextInt();
}
 @Override
public void get_detailes() {
    System.out.println("Showroom name " + ShowroomName);
    System.out.println("Showroom address " + ShowroomAddress);
    System.out.println("Managers Name " + ManagerName);
    System.out.println("Total employees " + TotalEmployees);
    System.out.println("Total cars " + TotalCars);
}
    
    
}
