package Factory;

import Interfaces.iGameItems;
import Product.Medicine;

public class MedicineGenerator extends ItemGenerator {

    @Override
    public iGameItems createItem() {
        return new Medicine();
    }

}
