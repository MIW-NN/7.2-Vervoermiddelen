package vervoermiddelen.project.model;

public abstract class Vervoermiddel {
    private static int aantalVervoermiddelen = 0;

    private int id;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
        this.id = ++aantalVervoermiddelen;
        this.merk = merk;
        this.type = type;
    }

    public abstract String geefAandrijfkracht();

    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s aangedreven door %s", id, merk, type, geefAandrijfkracht());
    }
}
