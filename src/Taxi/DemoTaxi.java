package Taxi;

import Taxi.Cars.Car;

public class DemoTaxi {
    private static final TaxiStation station = new TaxiStation();

    public static void main(String[] args) {
        System.out.println("Вывод всего таксопарка :");

        TaxiPrinter.printCars(station.getCars());
        System.out.println("Машины отсортированные по расходу топлива :");
        TaxiPrinter.printCars(station.sortByConsumption());

        printBySpeedLimitation(100, 150);

        printCostAllCar();


    }

    private static void printBySpeedLimitation(int min, int max) {
        System.out.println("Машины с максимальной скоростью от " + min + " км/ч до " + max + " км./ч:");
        TaxiPrinter.printCars(station.filterByMaxSpeed(min, max));
    }

    private static void printCostAllCar() {
        System.out.println("Стоимость всего таксопарка " + station.getCostAllCars());
    }


}
