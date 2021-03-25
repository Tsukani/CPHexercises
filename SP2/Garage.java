import java.util.ArrayList;

public class Garage {
    String garageName;
    ArrayList<Car> cars = new ArrayList<>();

    public Garage(String garageName) {
        this.garageName = garageName;
    }

    void addCarToGarage(Car car) {
        cars.add(car);
    }

    public double calculateGreenOwnershipTaxForGarage() {
        double total = 0;
        for (Car car : cars) {
            total += car.calculateGreenOwnershipTax();
        }
        return total;
    }

    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i<cars.size(); i++) {

            str += cars.get(i) + (i+1 != cars.size() ? ", " : "");
        }
        str += "}";
        return str;
    }
}