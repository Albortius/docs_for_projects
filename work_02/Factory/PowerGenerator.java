package Factory;

import Interfaces.iGameItems;
import Product.Power;

public class PowerGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Power();
    }

}
