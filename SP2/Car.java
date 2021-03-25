abstract class Car {
    String regNr;
    String brand;
    String model;
    int year;
    int numberOfDoors;

    Car(String regNr, String brand, String model, int year, int numberOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    abstract double calculateGreenOwnershipTax();

    String getRegNr() {
        return regNr;
    }

    void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getNumberOfDoors() {
        return numberOfDoors;
    }

    void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
