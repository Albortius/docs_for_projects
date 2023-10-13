package Factory;

import Interfaces.iGameItems;
import Product.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Gem();
    }

}
