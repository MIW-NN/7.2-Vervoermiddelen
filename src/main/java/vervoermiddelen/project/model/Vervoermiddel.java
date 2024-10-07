package vervoermiddelen.project.model;

public abstract class Vervoermiddel {
    private static int aantalVervoermiddelen = 0;

    private int id;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
    }

    public abstract String geefAandrijfkracht();

    @Override
    public String toString() {
        return "";
    }
}
