package vervoermiddelen.project.model;

public class Bike extends Vehicle {
    private static final int AMOUNT_OF_WHEELS = 2;

    public Bike(String brand, String type, int weight) {
        super(brand, type, AMOUNT_OF_WHEELS, weight);
    }

    @Override
    public String giveMotivePower() {
        return ("menskracht");
    }
}
