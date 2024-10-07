package vervoermiddelen.project.model;

public abstract class Voertuig {
    private int aantalWielen;
    private int gewicht;

    protected Voertuig(String merk, String type, int aantalWielen, int gewicht) {
    }
}
