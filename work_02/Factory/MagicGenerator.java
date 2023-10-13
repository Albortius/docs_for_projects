package Factory;

import Interfaces.iGameItems;
import Product.Magic;

public class MagicGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Magic();
    }

}
