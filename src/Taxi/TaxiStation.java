package Taxi;

import Taxi.Cars.BusinessCar;
import Taxi.Cars.Car;
import Taxi.Cars.EcoromCar;
import Taxi.Cars.LuxCar;

import java.util.*;


public class TaxiStation {
    private final ArrayList<Car> cars = new ArrayList<Car>(List.of(
            new BusinessCar("Renault", 2015, 15000, 12, 150, 5),
            new BusinessCar("Volksvagen", 2019, 23000, 12, 160, 7),
            new BusinessCar("Audi", 2020, 40000, 15, 200, 5),
            new BusinessCar("Mercedes", 2020, 70000, 22, 200, 5),
            new BusinessCar("Audi", 2018, 30000, 15, 180, 5),
            new EcoromCar("Lada", 2001, 5000, 10, 100, 200000),
            new EcoromCar("Lada", 2015, 9000, 9, 100, 140000),
            new EcoromCar("Lada", 2015, 6000, 8, 110, 120000),
            new EcoromCar("Skoda", 2019, 8000, 9, 120, 100000),
            new LuxCar("Linkoln", 2015, 50000, 29, 100, 7),
            new LuxCar("Linkoln", 2019, 70000, 35, 150, 9),
            new LuxCar("Maybah", 2020, 150000, 45, 200, 7)));


    public List<Car> getCars() {
        return this.cars;
    }

    public int getCostAllCars() {
        int totalCoast = 0;
        for (Car car : cars) {
            totalCoast += car.getCostCar();
        }
        System.out.println(totalCoast);
        return totalCoast;
    }


    public List<Car> sortByConsumption() {
        Collections.sort(cars, Comparator.comparingDouble(Car::getConsumption));
        return this.cars;
    }

    public List<Car> sortBySpeed() {
        Collections.sort(cars, Comparator.comparingInt(Car::getMaxSpeed));
        return this.cars;
    }

    public List<Car> filterByMaxSpeed(int minValue, int maxValue) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minValue && car.getMaxSpeed() <= maxValue) {
                result.add(car);
            }
        }

        return result;
    }
}
