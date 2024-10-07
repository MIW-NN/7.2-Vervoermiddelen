package vervoermiddelen.project.model;

public class Auto extends Voertuig implements Belastbaar {
    protected static final int AANTAL_WIELEN = 4;

    private static final int BOVENGRENS_GEWICHT_GROEP_1 = 1000;
    private static final int ONDERGRENS_GEWICHT_GROEP_3 = 1450;
    private static final int TARIEF_GROEP_1 = 85;
    private static final int TARIEF_GROEP_2 = 104;
    private static final int TARIEF_GROEP_3 = 122;

    private static final String ELEKTRISCH = "elektrische";
    private static final String DIESEL = "diesel";
    private static final double FACTOR_ELEKTRISCH = .5;
    private static final double FACTOR_DIESEL = 1.3;

    private final String soortBrandstof;

    public Auto(String merk, String type, int gewicht, String soortBrandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public String geefAandrijfkracht() {
        return soortBrandstof + " motor";
    }

    @Override
    public double getVervoerBelasting() {
        return kostenOpBasisVanGewicht() * factorOpBasisVanBrandstof();
    }

    private double factorOpBasisVanBrandstof() {
        if (soortBrandstof.equals(ELEKTRISCH)) {
            return FACTOR_ELEKTRISCH;
        } else if (soortBrandstof.equals(DIESEL)) {
            return FACTOR_DIESEL;
        }
        return 1;
    }

    private int kostenOpBasisVanGewicht() {
        if (getGewicht() < BOVENGRENS_GEWICHT_GROEP_1) {
            return TARIEF_GROEP_1;
        } else if (getGewicht() > ONDERGRENS_GEWICHT_GROEP_3) {
            return TARIEF_GROEP_3;
        } else {
            return TARIEF_GROEP_2;
        }
    }
}
