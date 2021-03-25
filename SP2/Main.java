public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("Brians Hotwheels");
        garage.addCarToGarage(new PetrolCar("Y42W8JH82Z", "AUDI", "R8 SPYDER", 2019, 2, 89, 30));
        garage.addCarToGarage(new DieselCar("7AH58PF2S8", "ASTON", " MARTIN ONE-77", 2020, 2, true, 34));
        garage.addCarToGarage(new ElectricCar("MONEKM00UH", "TESLA", "MODEL 3", 2020, 4, 100, 150, 32000));
        System.out.println(garage.toString());
        System.out.println(garage.calculateGreenOwnershipTaxForGarage());
    }
}
