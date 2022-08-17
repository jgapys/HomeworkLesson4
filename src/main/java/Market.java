import java.util.ArrayList;
import java.util.List;

public class Market {
    private final String name;
    private final List<Country> countries;

    public Market(String name) {
        this.name = name;
        this.countries = new ArrayList<>();
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountryToList(Country country) {
        countries.add(country);
    }
}