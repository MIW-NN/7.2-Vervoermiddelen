package vervoermiddelen.project.model;

public class Motorboat extends Boat  {
    private String typeOfFuel;

    public Motorboat(String brand, String type, double length, String typeOfFuel) {
        super(brand, type, length);
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public String giveMotivePower() {
        return (this.typeOfFuel + "motor");
    }
}
