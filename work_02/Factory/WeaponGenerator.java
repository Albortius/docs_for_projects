package Factory;

import Interfaces.iGameItems;
import Product.Weapon;

public class WeaponGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Weapon();
    }

}
