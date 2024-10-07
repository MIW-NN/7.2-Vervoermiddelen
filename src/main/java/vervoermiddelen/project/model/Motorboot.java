package vervoermiddelen.project.model;

public class Motorboot extends Vaartuig {
    private String soortBrandstof;

    public Motorboot(String merk, String type, double lengte, String soortBrandstof) {
        super(merk, type, lengte);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public String geefAandrijfkracht() {
        return soortBrandstof + " motor";
    }
}
