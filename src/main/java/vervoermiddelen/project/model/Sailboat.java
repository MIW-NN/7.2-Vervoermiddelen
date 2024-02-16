package vervoermiddelen.project.model;

public class Sailboat extends Boat {
    public Sailboat(String brand, String type, double length) {
        super(brand, type, length);
    }

    @Override
    public String giveMotivePower() {
        return ("windkracht");
    }
}
