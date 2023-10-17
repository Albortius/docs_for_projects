package Classes;

import java.awt.Color;

import Enumerators.TypeOfBody;
import Enumerators.TypeOfGerBox;
import Interfaces.iCarWipping;
import Interfaces.iFuelStation;

public class Pickup extends Car implements iCarWipping, iFuelStation {
    private float loadCapacity;

    public Pickup(String maker, String model, Color color, int numberOfWheels,
            TypeOfGerBox typeOfGerBox, TypeOfFuel typeOfFuel, float engineCapacity, float loadCapacity) {
        super(maker, model, color, TypeOfBody.Pickup(), numberOfWheels, typeOfGerBox, typeOfFuel, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub

    }

    @Override
    public void wipheadlights() {
        // TODO Auto-generated method stub

    }

    @Override
    public void wipmirrors() {
        // TODO Auto-generated method stub

    }

    @Override
    public void wipwindshilde() {
        // TODO Auto-generated method stub

    }

}
