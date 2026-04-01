import java.util.ArrayList;
import java.util.List;

public class FruitsList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Манго");
        fruits.add("Киви");
        fruits.add("Маракуйя");
        fruits.add("Кокос");
        fruits.add("Папайя");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));
        }
    }
}
