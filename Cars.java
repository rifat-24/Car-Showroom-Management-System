import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String CarsName;
    String CarColor;
    int CarPrize;
    String CarType;
     @Override
    public void set_detailes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CarName");
        CarsName = sc.nextLine();
        System.out.println("Enter the CarColor");
        CarColor = sc.nextLine();
        System.out.println("Enter the Prize");
        CarPrize = sc.nextInt();
        System.out.println("Enter the CarTypes");
        CarType = sc.nextLine();
    }
    @Override
    public void get_detailes() {
        System.out.print("Cars name " + CarsName);
        System.out.print("Cars Color " + CarColor);
        System.out.print("Cars prize " + CarPrize);
    }
}
