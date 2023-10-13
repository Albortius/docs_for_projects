import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Factory.GemGenerator;
import Factory.GoldGenerator;
import Factory.ItemGenerator;
import Factory.MagicGenerator;
import Factory.MedicineGenerator;
import Factory.MeelGenerator;
import Factory.PowerGenerator;
import Factory.SilverGenerator;
import Factory.WeaponGenerator;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> listOfProducts = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            listOfProducts.add(new GemGenerator());
            listOfProducts.add(new PowerGenerator());
            listOfProducts.add(new WeaponGenerator());
            for (int j = 0; j < 2; j++) {
                listOfProducts.add(new GoldGenerator());
                listOfProducts.add(new MagicGenerator());
                listOfProducts.add(new MedicineGenerator());
            }
            for (int k = 0; k < 5; k++) {
                listOfProducts.add(new MeelGenerator());
                listOfProducts.add(new SilverGenerator());
            }
        }
        for (int i = 0; i < 15; i++) {
            int index = random.nextInt(57);
            listOfProducts.get(index).openReward();
        }
    }
}
