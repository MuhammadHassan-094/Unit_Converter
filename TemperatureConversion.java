import java.util.Scanner;

public class TemperatureConversion {
    // Temperature methods RETURN values (as requested)

    double celsiusToFahrenheit(double c) { 
        return (c * 9/5) + 32; 
    }

    double fahrenheitToCelsius(double f) { 
        return (f - 32) * 5/9; 
    }

    double celsiusToKelvin(double c) { 
        return c + 273.15; 
    }

    double kelvinToCelsius(double k) { 
        return k - 273.15; 
    }

    double celsiusToRankine(double c) { 
        return (c + 273.15) * 9/5; 
    }

    double rankineToCelsius(double r) { 
        return (r - 491.67) * 5/9; 
    }

    double fahrenheitToKelvin(double f) { 
        return (f - 32) * 5/9 + 273.15; 
    }

    double kelvinToFahrenheit(double k) { 
        return (k - 273.15) * 9/5 + 32; 
    }

    double fahrenheitToRankine(double f) { 
        return f + 459.67; 
    }

    double rankineToFahrenheit(double r) { 
        return r - 459.67; }

    double kelvinToRankine(double k) { 
        return k * 9/5; 
    }

    double rankineToKelvin(double r) { 
        return r * 5/9; 
    }

    public void showTemperatureMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== Temperature Conversion (C, F, K, R) ====");
        System.out.println(" 1.  C -> F      2.  F -> C");
        System.out.println(" 3.  C -> K      4.  K -> C");
        System.out.println(" 5.  C -> R      6.  R -> C");
        System.out.println(" 7.  F -> K      8.  K -> F");
        System.out.println(" 9.  F -> R     10.  R -> F");
        System.out.println("11.  K -> R     12.  R -> K");
        System.out.print("Choose option (1-12): ");
        int c = sc.nextInt();
        System.out.print("Enter value: ");
        double v = sc.nextDouble();

        switch (c) {
            case 1:  System.out.println(v + " °C = " + celsiusToFahrenheit(v) + " °F"); break;
            case 2:  System.out.println(v + " °F = " + fahrenheitToCelsius(v) + " °C"); break;
            case 3:  System.out.println(v + " °C = " + celsiusToKelvin(v) + " K"); break;
            case 4:  System.out.println(v + " K = " + kelvinToCelsius(v) + " °C"); break;
            case 5:  System.out.println(v + " °C = " + celsiusToRankine(v) + " °R"); break;
            case 6:  System.out.println(v + " °R = " + rankineToCelsius(v) + " °C"); break;
            case 7:  System.out.println(v + " °F = " + fahrenheitToKelvin(v) + " K"); break;
            case 8:  System.out.println(v + " K = " + kelvinToFahrenheit(v) + " °F"); break;
            case 9:  System.out.println(v + " °F = " + fahrenheitToRankine(v) + " °R"); break;
            case 10: System.out.println(v + " °R = " + rankineToFahrenheit(v) + " °F"); break;
            case 11: System.out.println(v + " K = " + kelvinToRankine(v) + " °R"); break;
            case 12: System.out.println(v + " °R = " + rankineToKelvin(v) + " K"); break;
            default: System.out.println("Invalid choice!");
        }
    }
}
