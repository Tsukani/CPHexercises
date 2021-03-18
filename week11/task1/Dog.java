import java.util.ArrayList;

public class Dog {
    private String name;
    private boolean isHungry;
    Owner owner = new Owner();
    private String[] offSpring;
    private int offSpringSize;
    private ArrayList<String> extraOffSpring = new ArrayList<>();

    Dog(String name, boolean isHungry, int offspringSize) {
        this.name =  name;
        this.isHungry = isHungry;
        this.offSpringSize = offspringSize;
        offSpring = new String[offspringSize];
    }

    String getName() {
        return name;
    }

    void setOwner(String ownerName) {
        this.owner.setOwner(ownerName);
    }

    String getOwner() {
        return this.owner.getName();
    }

    String feedDog() {
        if (isHungry) {
            isHungry = false;
            return name + " er nu mæt!";
        } else {
            return name + " var ikke sulten!";
        }
    }

    void setOffSpring(String puppyName) {
        int dogsInOffSpring = 0;
        for (int i = 0; i < offSpring.length; i++) {
            if (offSpring[i] == null) {
                offSpring[i] = puppyName;
                break;
            } else {
                dogsInOffSpring++;
            }
            if (dogsInOffSpring == offSpringSize) {
                extraOffSpring.add(puppyName);
            }
        }
    }

    String[] getOffSpring() {
        String[] arr = offSpring;
        return arr;
    }
    ArrayList getOffSpringExtra() {
        return extraOffSpring;
    }
}