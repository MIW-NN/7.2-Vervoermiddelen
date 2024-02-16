package vervoermiddelen.project.model;

public abstract class Vehicle {
    private int amountOfWheels;
    private int weight;

    protected Vehicle(String brand, String type, int amountOfWheels, int weight) {
    }
}
