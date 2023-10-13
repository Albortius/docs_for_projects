package Factory;

import Interfaces.iGameItems;
import Product.Meel;

public class MeelGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Meel();
    }

}
