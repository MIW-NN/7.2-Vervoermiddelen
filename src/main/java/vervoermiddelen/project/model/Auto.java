package vervoermiddelen.project.model;

public class Auto extends Voertuig {
    protected static final int AANTAL_WIELEN = 4;

    private String soortBrandstof;

    public Auto(String merk, String type, int gewicht, String soortBrandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public String geefAandrijfkracht() {
        return soortBrandstof + " motor";
    }
}
