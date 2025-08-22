import java.util.Scanner;

public class MainConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Unit Conversion Program ====");
        System.out.println("1. Weight Conversion");
        System.out.println("2. Length Conversion");
        System.out.println("3. Temperature Conversion");
        System.out.print("Choose an option (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                new WeightConversion().showWeightMenu();
                break;
            case 2:
                new LengthConversion().showLengthMenu();
                break;
            case 3:
                new TemperatureConversion().showTemperatureMenu();
                break;
            default:
                System.out.println("Invalid option! Please choose 1-3.");
        }
        sc.close();
    }
}

