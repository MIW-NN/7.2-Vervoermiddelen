package vervoermiddelen.project.model;

public abstract class Boat extends MeansOfTransport {
    private double lengthInMeters;

    protected Boat(String brand, String type, double length) {
        super(brand, type);
        this.lengthInMeters = length;
    }
}
