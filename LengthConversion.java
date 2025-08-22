import java.util.Scanner;

public class LengthConversion {
    // Base unit: Meter (m)
    // All methods PRINT results (fully functional style)

    // --- m <-> kilometer ---
    void meterToKilometer(double m) { 
        System.out.println(m + " m = " + (m / 1000.0) + " km"); 
    }

    void kilometerToMeter(double km) { 
        System.out.println(km + " km = " + (km * 1000.0) + " m"); 
    }

    // --- m <-> centimeter ---
    void meterToCentimeter(double m) { 
        System.out.println(m + " m = " + (m * 100.0) + " cm"); 
    }

    void centimeterToMeter(double cm) { 
        System.out.println(cm + " cm = " + (cm / 100.0) + " m"); 
    }

    // --- m <-> millimeter ---
    void meterToMillimeter(double m) { 
        System.out.println(m + " m = " + (m * 1000.0) + " mm"); 
    }

    void millimeterToMeter(double mm) { 
        System.out.println(mm + " mm = " + (mm / 1000.0) + " m"); 
    }

    // --- m <-> micrometer ---
    void meterToMicrometer(double m) { 
        System.out.println(m + " m = " + (m * 1_000_000.0) + " µm"); 
    }

    void micrometerToMeter(double um) { 
        System.out.println(um + " µm = " + (um / 1_000_000.0) + " m"); 
    }

    // --- m <-> nanometer ---
    void meterToNanometer(double m) { 
        System.out.println(m + " m = " + (m * 1_000_000_000.0) + " nm"); 
    }

    void nanometerToMeter(double nm) { 
        System.out.println(nm + " nm = " + (nm / 1_000_000_000.0) + " m"); 
    }

    // --- m <-> inch ---
    void meterToInch(double m) { 
        System.out.println(m + " m = " + (m * 39.3701) + " in"); 
    }

    void inchToMeter(double in) { 
        System.out.println(in + " in = " + (in / 39.3701) + " m"); 
    }

    // --- m <-> foot ---
    void meterToFoot(double m) { 
        System.out.println(m + " m = " + (m * 3.28084) + " ft"); 
    }

    void footToMeter(double ft) { 
        System.out.println(ft + " ft = " + (ft / 3.28084) + " m"); 
    }

    // --- m <-> yard ---
    void meterToYard(double m) { 
        System.out.println(m + " m = " + (m * 1.09361) + " yd"); 
    }

    void yardToMeter(double yd) { 
        System.out.println(yd + " yd = " + (yd / 1.09361) + " m"); 
    }

    // --- m <-> mile ---
    void meterToMile(double m) { 
        System.out.println(m + " m = " + (m / 1609.34) + " mi"); 
    }

    void mileToMeter(double mi) { 
        System.out.println(mi + " mi = " + (mi * 1609.34) + " m"); 
    }

    // --- m <-> nautical mile ---
    void meterToNauticalMile(double m) { 
        System.out.println(m + " m = " + (m / 1852.0) + " nmi"); 
    }

    void nauticalMileToMeter(double nmi) { 
        System.out.println(nmi + " nmi = " + (nmi * 1852.0) + " m"); 
    }

    // --- m <-> light-year ---
    void meterToLightYear(double m) { 
        System.out.println(m + " m = " + (m / 9.4607e15) + " ly"); 
    }
    
    void lightYearToMeter(double ly) { 
        System.out.println(ly + " ly = " + (ly * 9.4607e15) + " m"); 
    }

    public void showLengthMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== Length Conversion ====");
        System.out.println(" 1. m to km             2. km to m");
        System.out.println(" 3. m to cm             4. cm to m");
        System.out.println(" 5. m to mm             6. mm to m");
        System.out.println(" 7. m to micrometer     8. micrometer to m");
        System.out.println(" 9. m to nanometer     10. nanometer to m");
        System.out.println("11. m to inch          12. inch to m");
        System.out.println("13. m to foot          14. foot to m");
        System.out.println("15. m to yard          16. yard to m");
        System.out.println("17. m to mile          18. mile to m");
        System.out.println("19. m to nautical mile 20. nautical mile to m");
        System.out.println("21. m to light-year    22. light-year to m");
        System.out.print("Choose option (1-22): ");
        int c = sc.nextInt();
        System.out.print("Enter value: ");
        double v = sc.nextDouble();

        switch (c) {
            case 1:  meterToKilometer(v); break;
            case 2:  kilometerToMeter(v); break;
            case 3:  meterToCentimeter(v); break;
            case 4:  centimeterToMeter(v); break;
            case 5:  meterToMillimeter(v); break;
            case 6:  millimeterToMeter(v); break;
            case 7:  meterToMicrometer(v); break;
            case 8:  micrometerToMeter(v); break;
            case 9:  meterToNanometer(v); break;
            case 10: nanometerToMeter(v); break;
            case 11: meterToInch(v); break;
            case 12: inchToMeter(v); break;
            case 13: meterToFoot(v); break;
            case 14: footToMeter(v); break;
            case 15: meterToYard(v); break;
            case 16: yardToMeter(v); break;
            case 17: meterToMile(v); break;
            case 18: mileToMeter(v); break;
            case 19: meterToNauticalMile(v); break;
            case 20: nauticalMileToMeter(v); break;
            case 21: meterToLightYear(v); break;
            case 22: lightYearToMeter(v); break;
            default: System.out.println("Invalid choice!");
        }
    }
}
