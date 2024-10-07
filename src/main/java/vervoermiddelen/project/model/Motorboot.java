package vervoermiddelen.project.model;

public class Motorboot extends Vaartuig implements Belastbaar {
    private static final String DIESEL = "diesel";
    private static final double FACTOR_DIESEL = 1.5;
    private static final int LENGTE_GRENS_HOGER_TARIEF = 12;
    private static final int LAAG_TARIEF = 60;
    private static final int HOOG_TARIEF = 100;
    private final String soortBrandstof;

    public Motorboot(String merk, String type, double lengte, String soortBrandstof) {
        super(merk, type, lengte);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public String geefAandrijfkracht() {
        return soortBrandstof + " motor";
    }

    @Override
    public double getVervoerBelasting() {
        return belastingOpBasisVanLengte() * factorOpBasisVanBrandstof();
    }

    private double belastingOpBasisVanLengte() {
        if (getLengteInMeters() < LENGTE_GRENS_HOGER_TARIEF) {
            return LAAG_TARIEF;
        } else {
            return HOOG_TARIEF;
        }
    }

    private double factorOpBasisVanBrandstof() {
        if (soortBrandstof.equals(DIESEL)) {
            return FACTOR_DIESEL;
        }
        return 1;
    }
}
