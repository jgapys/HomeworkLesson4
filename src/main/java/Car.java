import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    private final Producer producer;
    private final boolean isAutomaticGear;
    private final Market market;
    private final String segment;
    private final ArrayList<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, Segment segment, ArrayList<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = String.valueOf(segment);
        this.dimensions = dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public static List<Car> findCarByProdAutoGearAndTrankCap(ArrayList<Car> cars, String producer, boolean isAutomaticGear, int trankCapacity) {
        return cars
                .stream()
                .filter(i -> i.getProducer().getModel().equals(producer)
                        && i.isAutomaticGear() == isAutomaticGear
                        && i.getDimensions().stream().anyMatch(j -> j.getTrankCapacity() > trankCapacity))
                .collect(Collectors.toList());
    }

    public static void printFilteredCarsCountry(List<Car> filteredCars) {
        if (filteredCars.isEmpty()) {
            System.out.println("There is no data that matches the given filters");
        } else {
            for (Car filteredCar : filteredCars) {
                System.out.println(filteredCar.market.getCountries());
            }
        }
    }
}