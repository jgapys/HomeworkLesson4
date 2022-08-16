import java.util.ArrayList;

public class Car {
    private final Producer producer;
    private final boolean isAutomaticGear;
    private final Market market;
    private final String segment;
    private final ArrayList<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }
}
