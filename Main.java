import java.util.*;
import java.lang.*;

interface utility {
    public void get_detailes();
    public void set_detailes();
}


public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Cars cars[] = new Cars[5];
        Employees employees[] = new Employees[5];
        int cnt_showroom = 0;
        int cnt_employee = 0;
        int cnt_cars = 0;
        int choice = -1;
        //choice = sc.nextInt();
while(choice != 0) {
    main_menu();
    choice = sc.nextInt();
    while(choice != 0 && choice != 9) {
        switch (choice) {
            case 1:
                showroom[cnt_showroom] = new Showroom();
                showroom[cnt_showroom].set_detailes();
                cnt_showroom++;
                System.out.println();
                System.out.println("1].ADD NEW SHOWROOM");
                System.out.println("9].GO BACK TO MAIN MENU");
                choice = sc.nextInt();
                break;
            case 2:
                employees[cnt_employee] = new Employees();
                employees[cnt_employee].set_detailes();
                cnt_employee++;
                System.out.println();
                System.out.println("2].ADD NEW EMPLOYEE");
                System.out.println("9].GO BACK TO MAIN MENU");
                choice = sc.nextInt();
                break;
            case 3:
                cars[cnt_cars] = new Cars();
                cars[cnt_cars].set_detailes();
                cnt_cars++;
                System.out.println();
                System.out.println("3].ADD NEW CAR");
                System.out.println("9].GO BACK TO MAIN MENU");
                choice = sc.nextInt();
                break;
            case 4:
                for(int i = 0; i < cnt_showroom; i++) {
                showroom[i].get_detailes();
                System.out.println();
                System.out.println();
                }
                System.out.println();
                System.out.println("9].GO BACK TO MAIN MENU");
                System.out.println("0].EXIT");
                choice = sc.nextInt();
                break;

            case 5:
                for(int i = 0; i < cnt_employee; i++) {
                    employees[i].get_detailes();
                    System.out.println();
                    System.out.println();
                }
                System.out.println();
                System.out.println("9].GO BACK TO MAIN MENU");
                System.out.println("0].EXIT");
                choice = sc.nextInt();
                break;
            case 6:
                for(int i = 0; i < cnt_cars; i++) {
                    cars[i].get_detailes();
                    System.out.println();
                    System.out.println();
                }
                System.out.println();
                System.out.println("9].GO BACK TO MAIN MENU");
                System.out.println("0].EXIT");
                choice = sc.nextInt();
                break;
            default:
                System.out.println("ENTER VALID CHOICE: ");
                choice = sc.nextInt();
                break;
        }
    }
}


        
    }
}
