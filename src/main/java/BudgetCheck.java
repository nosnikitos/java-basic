import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class BudgetCheck {

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();

        prices.add(199.99);
        prices.add(21.21);
        prices.add(60.01);
        prices.add(77.77);
        prices.add(55.44);

        double budget = 550.0;
        double total = 0;

        for (double price : prices) {
            total += price;
        }
        System.out.println("Общая стоимость: " + total);

        if (budget >= total) {
            System.out.printf(Locale.US, "Кеша хватает! Осталось: %.2f", budget - total);
        } else {
            System.out.printf(Locale.US, "Братан, не хватает %.2f", total - budget);
        }
        // Делаю через printf - потому что хочу только 2 знака после запятой.
        // Locale.US - чтобы число через точку было, а не через запятую.
    }
}
