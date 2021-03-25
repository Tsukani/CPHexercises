public class ElectricCar extends Car {
    int batteryCapacityKWh;
    int maxKm;
    int whPrKm;

    public ElectricCar(String regNr, String brand, String model, int year, int numberOfDoors, int batteryCapacityKWh, int maxKm, int whPrKm) {
        super(regNr, brand, model, year, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double calculateGreenOwnershipTax() {
        double kmPrL = (100/(whPrKm/91.25));


             if (kmPrL >= 20 && kmPrL < 50) return 330;
        else if (kmPrL >= 15 && kmPrL < 20) return 1050;
        else if (kmPrL >= 10 && kmPrL < 15) return 2340;
        else if (kmPrL >= 5  && kmPrL < 10) return 5500;
        else if (kmPrL < 5)                 return 10470;
        else                                return -1;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "{regNr: " + getRegNr() +
                ", brand: " + getBrand() +
                ", model: " + getModel() +
                ", year: " + getYear() +
                ", numberOfDoors: " + getNumberOfDoors() +
                ", batteryCapacityKWh: " + getBatteryCapacityKWh() +
                ", maxKm: " + getMaxKm() +
                ", whPrKm: " + getWhPrKm() +
                "}";
    }
}
