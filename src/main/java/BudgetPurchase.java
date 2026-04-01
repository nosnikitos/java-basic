import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BudgetPurchase {
    public static void main(String[] args) {

        List<Double> prices = new ArrayList<>();

        prices.add(199.99);
        prices.add(21.21);
        prices.add(60.01);
        prices.add(77.77);
        prices.add(55.44);

        double budget = 90;
        double totalSpent = 0;
        int bought = 0;

        while (bought < prices.size() && totalSpent + prices.get(bought) < budget) {
            totalSpent += prices.get(bought);
            bought++;
        }

        int notBought = prices.size() - bought;
        double remainingBudget = budget - totalSpent;

        System.out.printf(Locale.US, "Куплено: %d %s на сумму: %.2f%n", bought, pluralize(bought), totalSpent);
        System.out.printf(Locale.US, "Остаток бюджета: %.2f%n", remainingBudget);
        System.out.printf(Locale.US, "Не куплено: %d %s%n", notBought, pluralize(notBought));
    }

    // Метод для правильного склонения слова "товар"
    public static String pluralize(int count) {
        if (count % 100 >= 11 && count % 100 <= 14) {
            return "товаров";
        }
        return switch (count % 10) {
            case 1 -> "товар";
            case 2, 3, 4 -> "товара";
            default -> "товаров";
        };
    }
}
