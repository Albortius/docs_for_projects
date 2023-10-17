package Classes;

import Enumerators.TypeOfBody;
import Enumerators.TypeOfGerBox;

import java.awt.*;

public abstract class Car {
    private String maker;
    private String model;
    private Color color;
    private TypeOfBody typeOfBody;
    private int numberOfWheels;
    private TypeOfGerBox typeOfGerBox;
    private TypeOfFuel typeOfFuel;
    private float engineCapacity;

    public Car(String maker, String model, Color color, TypeOfBody typeOfBody, int numberOfWheels,
            TypeOfGerBox typeOfGerBox, TypeOfFuel typeOfFuel, float engineCapacity) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numberOfWheels = numberOfWheels;
        this.typeOfGerBox = typeOfGerBox;
        this.typeOfFuel = typeOfFuel;
        this.engineCapacity = engineCapacity;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public TypeOfGerBox getTypeOfGerBox() {
        return typeOfGerBox;
    }

    public void setTypeOfGerBox(TypeOfGerBox typeOfGerBox) {
        this.typeOfGerBox = typeOfGerBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void movement() {
    }

    public void maintenance() {
    }

    public boolean turnlight() {
        return true;
    }

    public boolean turnwrappers() {
        return true;
    }

}