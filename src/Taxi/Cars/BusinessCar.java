package Taxi.Cars;

import java.util.Objects;

public class BusinessCar extends Car {
    final private int pasCapacity;

    public BusinessCar(String model, int yearOfProduce, double costCar, double consumption, int maxSpeed, int pasCapacity) {
        super(model, yearOfProduce, costCar, consumption, maxSpeed);
        this.pasCapacity = pasCapacity;
    }

    public int getPasCapacity() {
        return pasCapacity;
    }

    @Override
    public String toString() {
        return "BusinessCars{" +
                "pasCapacity=" + pasCapacity +
                ", model='" + model + '\'' +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessCar)) return false;
        if (!super.equals(o)) return false;
        BusinessCar cars = (BusinessCar) o;
        return getPasCapacity() == cars.getPasCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPasCapacity());
    }
}
