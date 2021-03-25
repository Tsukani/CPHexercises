public class PetrolCar extends Car {
    int octaneRating;
    int kmPrL;

    PetrolCar(String regNr, String brand, String model, int year, int numberOfDoors, int octaneRating, int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.octaneRating = octaneRating;
        this.kmPrL = kmPrL;
    }

    double calculateGreenOwnershipTax() {
             if (this.kmPrL >= 20 && this.kmPrL < 50) return 330;
        else if (this.kmPrL >= 15 && this.kmPrL < 20) return 1050;
        else if (this.kmPrL >= 10 && this.kmPrL < 15) return 2340;
        else if (this.kmPrL >= 5  && this.kmPrL < 10) return 5500;
        else if (this.kmPrL < 5)                      return 10470;
        else                                          return -1;
    }

    int getOctaneRating() {
        return octaneRating;
    }

    void setOctaneRating(int octaneRating) {
        this.octaneRating = octaneRating;
    }

    int getKmPrL() {
        return kmPrL;
    }

    void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "{regNr: " + getRegNr() +
                ", brand: " + getBrand() +
                ", model: " + getModel() +
                ", year: " + getYear() +
                ", numberOfDoors: " + getNumberOfDoors() +
                ", octaneRating: " + getOctaneRating() +
                ", kmPrL: " + getKmPrL() +
                "}";
    }
}
