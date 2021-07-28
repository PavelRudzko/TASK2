package Taxi.Cars;

import java.util.Objects;

public class LuxCar extends Car {
    int sizeLimusine;

    public LuxCar(String model, int yearOfProduce, double costCar, double consumption, int maxSpeed, int sizeLimusine) {
        super(model, yearOfProduce, costCar, consumption, maxSpeed);
        this.sizeLimusine = sizeLimusine;
    }

    public int getSizeLimusine() {
        return sizeLimusine;
    }

    @Override
    public String toString() {
        return "LuxCars{" +
                "model='" + model + '\'' +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                ", sizeLimusine=" + sizeLimusine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LuxCar)) return false;
        if (!super.equals(o)) return false;
        LuxCar luxCars = (LuxCar) o;
        return getSizeLimusine() == luxCars.getSizeLimusine();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSizeLimusine());
    }
}
