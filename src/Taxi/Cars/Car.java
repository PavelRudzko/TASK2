package Taxi.Cars;

import java.util.*;

 public abstract class Car {
    protected String model;
    protected int yearOfProduce;
    protected double costCar;
    protected double consumption;
    protected int maxSpeed;

    public Car(String model, int yearOfProduce, double costCar, double consumption, int maxSpeed) {
        this.model = model;
        this.yearOfProduce = yearOfProduce;
        this.costCar = costCar;
        this.consumption = consumption;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public double getCostCar() {
        return costCar;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", yearOfProduce=" + yearOfProduce +
                ", costCar=" + costCar +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car cars = (Car) o;
        return yearOfProduce == cars.yearOfProduce && Double.compare(cars.costCar, costCar) == 0 && Double.compare(cars.consumption, consumption) == 0 && maxSpeed == cars.maxSpeed && Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, yearOfProduce, costCar, consumption, maxSpeed);
    }
}

