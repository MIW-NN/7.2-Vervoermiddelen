package vervoermiddelen.project.model;

public class Coach extends Vehicle {
    private int amountOfHorses;
    private static final int AMOUNT_OF_WHEELS = 4;

    public Coach(String merk, String type, int gewicht, int amountOfHorses) {
        super(merk, type, AMOUNT_OF_WHEELS, gewicht);
        this.amountOfHorses = amountOfHorses;
    }

    @Override
    public String giveMotivePower() {
        return (this.amountOfHorses + " paarden");
    }
}
