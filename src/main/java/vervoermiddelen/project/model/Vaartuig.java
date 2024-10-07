package vervoermiddelen.project.model;

public abstract class Vaartuig extends Vervoermiddel {
    private double lengteInMeters;

    protected Vaartuig(String merk, String type, double lengte) {
        super(merk, type);
        this.lengteInMeters = lengte;
    }

    protected double getLengteInMeters() {
        return lengteInMeters;
    }
}
