public class DieselCar extends Car {
    boolean hasParticleFilter;
    int kmPrL;

    DieselCar(String regNr, String brand, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    double calculateGreenOwnershipTax() {
        double particleFilterTax = 0;
        if (!this.hasParticleFilter) particleFilterTax+=1000;

             if (this.kmPrL >= 20 && this.kmPrL < 50) return particleFilterTax+330+130;
        else if (this.kmPrL >= 15 && this.kmPrL < 20) return particleFilterTax+1050+1390;
        else if (this.kmPrL >= 10 && this.kmPrL < 15) return particleFilterTax+2340+1850;
        else if (this.kmPrL >= 5  && this.kmPrL < 10) return particleFilterTax+5500+2770;
        else if (this.kmPrL <  5)                     return particleFilterTax+10470+15260;
        else                                          return -1;
    }

    boolean getHasParticleFilter() {
        return hasParticleFilter;
    }

     void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
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
                ", hasParticleFilter: " + getHasParticleFilter() +
                ", kmPrL: " + getKmPrL() +
                "}";
    }
}
