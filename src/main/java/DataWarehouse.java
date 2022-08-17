import java.util.ArrayList;

public class DataWarehouse {
    public static ArrayList<Car> createRequiredData() {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country china = new Country("China", 'C');
        Country netherlands = new Country("The Netherlands", 'N');
        Country korea = new Country("Korea", 'K');
        Country japan = new Country("Japan", 'J');
        Country usa = new Country("USA", 'U');
        Country canada = new Country("Canada", 'C');
        Country mexico = new Country("Mexico", 'M');
        Country sweden = new Country("Sweden", 'S');
        Country france = new Country("France", 'F');

        Market european = new Market("European market");
        european.addCountryToList(poland);
        european.addCountryToList(germany);
        european.addCountryToList(netherlands);

        Market american = new Market("American market");
        american.addCountryToList(usa);
        american.addCountryToList(canada);
        american.addCountryToList(mexico);

        Market asian = new Market("Asian market");
        asian.addCountryToList(china);
        asian.addCountryToList(korea);
        asian.addCountryToList(japan);

        Market truck = new Market("Truck market");
        truck.addCountryToList(germany);
        truck.addCountryToList(sweden);
        truck.addCountryToList(france);

        Market electric = new Market("Electric car market");
        electric.addCountryToList(china);
        electric.addCountryToList(japan);
        electric.addCountryToList(usa);

        ArrayList<Dimension> smallDimensions = new ArrayList<>();
        smallDimensions.add(new Dimension(74, 161, 200));
        smallDimensions.add(new Dimension(75, 145, 210));
        smallDimensions.add(new Dimension(78, 132, 160));

        ArrayList<Dimension> mediumDimensions = new ArrayList<>();
        mediumDimensions.add(new Dimension(78, 156, 310));
        mediumDimensions.add(new Dimension(80, 150, 350));
        mediumDimensions.add(new Dimension(82, 152, 410));

        ArrayList<Dimension> bigDimensions = new ArrayList<>();
        bigDimensions.add(new Dimension(81, 168, 500));
        bigDimensions.add(new Dimension(81, 175, 570));
        bigDimensions.add(new Dimension(87, 172, 640));
        bigDimensions.add(new Dimension(99, 189, 720));

        Producer BMWX1 = new Producer("BMW", "X1");
        Producer BMWX3 = new Producer("BMW", "X3");
        Producer BMWX4 = new Producer("BMW", "X4");
        Producer mercedesEQB = new Producer("Mercedes", "EQB");
        Producer mercedesEQC = new Producer("Mercedes", "EQC");
        Producer mercedesEQE = new Producer("Mercedes", "EQE");
        Producer renaultMegane = new Producer("Renault", "Megane");
        Producer renaultCaptur = new Producer("Renault", "Captur");
        Producer renaultPremium = new Producer("Renault", "Premium");
        Producer nissanLeaf = new Producer("Nissan", "Leaf");
        Producer nissanJuke = new Producer("Nissan", "Juke");
        Producer nissanMicra = new Producer("Nissan", "Micra");
        Producer peugeot3008 = new Producer("Peugeot", "3008");

        Car bmwx1Medium = new Car(BMWX1, true, american, Segment.STANDARD, mediumDimensions);
        Car bmwx1Big = new Car(BMWX1, true, american, Segment.PREMIUM, bigDimensions);
        Car bmwx3Medium = new Car(BMWX3, false, american, Segment.PREMIUM, mediumDimensions);
        Car bmwx4Medium = new Car(BMWX4, true, european, Segment.STANDARD, mediumDimensions);
        Car mercedesEQBSmall = new Car(mercedesEQB, false, european, Segment.STANDARD, smallDimensions);
        Car mercedesEQBMedium = new Car(mercedesEQB, true, asian, Segment.MEDIUM, mediumDimensions);
        Car mercedesEQCSmall = new Car(mercedesEQC, false, european, Segment.STANDARD, smallDimensions);
        Car mercedesEQEMedium = new Car(mercedesEQE, false, asian, Segment.MEDIUM, mediumDimensions);
        Car renaultMeganeMedium = new Car(renaultMegane, true, american, Segment.MEDIUM, mediumDimensions);
        Car renaultCapturMedium = new Car(renaultCaptur, false, asian, Segment.MEDIUM, mediumDimensions);
        Car renaultPremiumBig = new Car(renaultPremium, true, truck, Segment.PREMIUM, bigDimensions);
        Car nissanLeafBig = new Car(nissanLeaf, true, electric, Segment.PREMIUM, bigDimensions);
        Car nissanJukeSmall = new Car(nissanJuke, false, european, Segment.STANDARD, smallDimensions);
        Car nissanMicraMedium = new Car(nissanMicra, true, asian, Segment.STANDARD, mediumDimensions);
        Car peugeot3008Big = new Car(peugeot3008, true, electric, Segment.PREMIUM, bigDimensions);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmwx1Medium);
        cars.add(bmwx1Big);
        cars.add(bmwx3Medium);
        cars.add(bmwx4Medium);
        cars.add(mercedesEQBSmall);
        cars.add(mercedesEQBMedium);
        cars.add(mercedesEQCSmall);
        cars.add(mercedesEQEMedium);
        cars.add(renaultMeganeMedium);
        cars.add(renaultCapturMedium);
        cars.add(renaultPremiumBig);
        cars.add(nissanLeafBig);
        cars.add(nissanJukeSmall);
        cars.add(nissanMicraMedium);
        cars.add(peugeot3008Big);

        return cars;
    }
}