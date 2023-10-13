package Factory;

import Interfaces.iGameItems;
import Product.Silver;

public class SilverGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Silver();
    }

}
