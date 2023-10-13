package Factory;

import Interfaces.iGameItems;

public abstract class ItemGenerator {
    public abstract iGameItems createItem();

    public void openReward() {
        createItem().open();
    }
}
