import java.util.Scanner;

public class CurrencyConverter {

    // Exchange rates
    private static final double NAIRA_TO_USD_RATE = 0.00072; // real rate
    private static final double USD_TO_NAIRA_RATE = 1473.98;    // real rate

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Currency Converter");
            System.out.println("1. Convert Naira to USD");
            System.out.println("2. Convert USD to Naira");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in Naira: ");
                    double nairaAmount = scanner.nextDouble();
                    double usdResult = convertNairaToUsd(nairaAmount);
                    System.out.printf("%.2f Naira is %.2f USD\n", nairaAmount, usdResult);
                    break;
                case 2:
                    System.out.print("Enter amount in USD: ");
                    double usdAmount = scanner.nextDouble();
                    double nairaResult = convertUsdToNaira(usdAmount);
                    System.out.printf("%.2f USD is %.2f Naira\n", usdAmount, nairaResult);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    // Conversion method from Naira to USD
    private static double convertNairaToUsd(double naira) {
        return naira * NAIRA_TO_USD_RATE;
    }

    // Conversion method from USD to Naira
    private static double convertUsdToNaira(double usd) {
        return usd * USD_TO_NAIRA_RATE;
    }
}

