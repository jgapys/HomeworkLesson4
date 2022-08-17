import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = DataWarehouse.createRequiredData();
        Car.printFilteredCarsCountry(Car.findCarByProdAutoGearAndTrankCap(cars, "BMW", 300));
    }
}