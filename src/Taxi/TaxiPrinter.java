package Taxi;

import Taxi.Cars.Car;

import java.util.List;

public class TaxiPrinter {
    public static void printCar(Car car) {
        System.out.println(car.toString());
    }

    public static void printCars(List<Car> cars) {
        for (Car car : cars) {
            printCar(car);
        }
    }
}
