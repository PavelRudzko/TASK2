package Taxi.Cars;

import java.util.Objects;

public class EcoromCar extends Car {
    int mileage;

    public EcoromCar(String model, int yearOfProduce, double costCar, double consumption, int maxSpeed, int mileage) {
        super(model, yearOfProduce, costCar, consumption, maxSpeed);
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "EcoromCars{" +
                "model='" + model + '\'' +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EcoromCar)) return false;
        if (!super.equals(o)) return false;
        EcoromCar cars = (EcoromCar) o;
        return mileage == cars.mileage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mileage);
    }
}
