package Factory;

import Interfaces.iGameItems;
import Product.Gold;

public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Gold();
    }

}
