import java.util.Scanner;

public class WeightConversion {
    // Base unit: Kilogram (kg)
    // All methods PRINT results (fully functional style)

    // --- kg <-> gram ---
    void kgToGram(double kg) { 
        System.out.println(kg + " kg = " + (kg * 1000) + " g"); 
    }
    void gramToKg(double g) { 
        System.out.println(g + " g = " + (g / 1000) + " kg"); 
    }

    // --- kg <-> milligram ---
    void kgToMilligram(double kg) { 
        System.out.println(kg + " kg = " + (kg * 1_000_000) + " mg"); 
    }
    void milligramToKg(double mg) { 
        System.out.println(mg + " mg = " + (mg / 1_000_000.0) + " kg"); 
    }

    // --- kg <-> microgram ---
    void kgToMicrogram(double kg) { 
        System.out.println(kg + " kg = " + (kg * 1_000_000_000L) + " µg"); 
    }
    void microgramToKg(double ug) { 
        System.out.println(ug + " µg = " + (ug / 1_000_000_000.0) + " kg"); 
    }

    // --- kg <-> pound ---
    void kgToPound(double kg) { 
        System.out.println(kg + " kg = " + (kg * 2.20462) + " lb"); 
    }
    void poundToKg(double lb) { 
        System.out.println(lb + " lb = " + (lb / 2.20462) + " kg"); 
    }

    // --- kg <-> ounce ---
    void kgToOunce(double kg) { 
        System.out.println(kg + " kg = " + (kg * 35.274) + " oz"); 
    }
    void ounceToKg(double oz) { 
        System.out.println(oz + " oz = " + (oz / 35.274) + " kg"); 
    }

    // --- kg <-> stone ---
    void kgToStone(double kg) { 
        System.out.println(kg + " kg = " + (kg / 6.35029) + " st"); 
    }
    void stoneToKg(double st) { 
        System.out.println(st + " st = " + (st * 6.35029) + " kg"); 
    }

    // --- kg <-> carat (1 ct = 0.2 g = 0.0002 kg) ---
    void kgToCarat(double kg) { 
        System.out.println(kg + " kg = " + (kg / 0.0002) + " ct"); 
    }
    void caratToKg(double ct) { 
        System.out.println(ct + " ct = " + (ct * 0.0002) + " kg"); 
    }

    // --- kg <-> tola (1 tola ≈ 11.6638038 g = 0.0116638038 kg) ---
    void kgToTola(double kg) { 
        System.out.println(kg + " kg = " + (kg / 0.0116638038) + " tola"); 
    }
    void tolaToKg(double tola) { 
        System.out.println(tola + " tola = " + (tola * 0.0116638038) + " kg"); 
    }

    // --- kg <-> quintal (1 quintal = 100 kg) ---
    void kgToQuintal(double kg) { 
        System.out.println(kg + " kg = " + (kg / 100.0) + " quintal"); 
    }
    void quintalToKg(double q) { 
        System.out.println(q + " quintal = " + (q * 100.0) + " kg"); 
    }

    // --- kg <-> metric ton (1 ton = 1000 kg) ---
    void kgToTon(double kg) { 
        System.out.println(kg + " kg = " + (kg / 1000.0) + " ton"); 
    }
    void tonToKg(double ton) { 
        System.out.println(ton + " ton = " + (ton * 1000.0) + " kg"); 
    }

    public void showWeightMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== Weight Conversion ====");
        System.out.println("1.  Kg to Gram            2.  Gram to Kg");
        System.out.println("3.  Kg to Milligram       4.  Milligram to Kg");
        System.out.println("5.  Kg to Microgram       6.  Microgram to Kg");
        System.out.println("7.  Kg to Pound           8.  Pound to Kg");
        System.out.println("9.  Kg to Ounce           10. Ounce to Kg");
        System.out.println("11. Kg to Stone           12. Stone to Kg");
        System.out.println("13. Kg to Carat           14. Carat to Kg");
        System.out.println("15. Kg to Tola            16. Tola to Kg");
        System.out.println("17. Kg to Quintal         18. Quintal to Kg");
        System.out.println("19. Kg to Ton             20. Ton to Kg");
        System.out.print("Choose option (1-20): ");
        int c = sc.nextInt();
        System.out.print("Enter value: ");
        double v = sc.nextDouble();

        switch (c) {
            case 1:  kgToGram(v); break;
            case 2:  gramToKg(v); break;
            case 3:  kgToMilligram(v); break;
            case 4:  milligramToKg(v); break;
            case 5:  kgToMicrogram(v); break;
            case 6:  microgramToKg(v); break;
            case 7:  kgToPound(v); break;
            case 8:  poundToKg(v); break;
            case 9:  kgToOunce(v); break;
            case 10: ounceToKg(v); break;
            case 11: kgToStone(v); break;
            case 12: stoneToKg(v); break;
            case 13: kgToCarat(v); break;
            case 14: caratToKg(v); break;
            case 15: kgToTola(v); break;
            case 16: tolaToKg(v); break;
            case 17: kgToQuintal(v); break;
            case 18: quintalToKg(v); break;
            case 19: kgToTon(v); break;
            case 20: tonToKg(v); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

