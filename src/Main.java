import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        //Add currency codes
        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "CAD");
        currencyCodes.put(3, "EUR");
        currencyCodes.put(4, "HKD");
        currencyCodes.put(5, "INR");

        String fromCode, toCode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the currency converter!");

        System.out.println("Currency converting from?");

        System.out.println("1:USD (US Dollar)\t 2:CAD (Canadian Dollar)\t 3:EUR (Euro)\t 4:HKD (Hong Kon Dollar)\t 5:INR (Indian Rupee)");
        fromCode = currencyCodes.get(sc.nextInt());


    }
}