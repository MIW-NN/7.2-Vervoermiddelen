package vervoermiddelen.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VervoermiddelenBelastbaarTest {

    // --- Auto: tariefgroepen op gewicht ---

    @Test
    void auto_benzine_lichtAutoOnder1000kg_geeft85Euro() {
        Auto auto = new Auto("Merk", "Type", 900, "benzine");
        assertEquals(85.0, auto.getVervoerBelasting(), 0.01);
    }

    @Test
    void auto_benzine_middenklasse1150kg_geeft104Euro() {
        Auto auto = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        assertEquals(104.0, auto.getVervoerBelasting(), 0.01);
    }

    @Test
    void auto_benzine_zwaarAutoBoven1450kg_geeft122Euro() {
        Auto auto = new Auto("Merk", "Type", 1600, "benzine");
        assertEquals(122.0, auto.getVervoerBelasting(), 0.01);
    }

    // --- Auto: brandstofopslag ---

    @Test
    void auto_diesel_middenklasse_geeft135Punt20Euro() {
        // 104 * 1.30 = 135.20
        Auto auto = new Auto("Merk", "Type", 1150, "diesel");
        assertEquals(135.20, auto.getVervoerBelasting(), 0.01);
    }

    @Test
    void auto_elektrisch_zwaareAuto_geeft61Euro() {
        // 122 * 0.50 = 61.00
        Auto auto = new Auto("Tesla", "S 100D", 2200, "elektrisch");
        assertEquals(61.0, auto.getVervoerBelasting(), 0.01);
    }

    // --- Motorboot: tarieven op lengte ---

    @Test
    void motorboot_benzine_korterDan12Meter_geeft60Euro() {
        Motorboot motorboot = new Motorboot("Merk", "Type", 10.0, "benzine");
        assertEquals(60.0, motorboot.getVervoerBelasting(), 0.01);
    }

    @Test
    void motorboot_benzine_groterDan12Meter_geeft100Euro() {
        Motorboot motorboot = new Motorboot("Merk", "Type", 13.0, "benzine");
        assertEquals(100.0, motorboot.getVervoerBelasting(), 0.01);
    }

    @Test
    void motorboot_diesel_groterDan12Meter_geeft150Euro() {
        // 100 * 1.50 = 150.00
        Motorboot motorboot = new Motorboot("Broesder", "Kotter", 13.75, "diesel");
        assertEquals(150.0, motorboot.getVervoerBelasting(), 0.01);
    }

    // --- Via Belastbaar-interface referentie ---

    @Test
    void auto_viaBelastbaarReferentie_geeftJuistBedrag() {
        Belastbaar belastbaar = new Auto("Merk", "Type", 1150, "benzine");
        assertEquals(104.0, belastbaar.getVervoerBelasting(), 0.01);
    }

    @Test
    void motorboot_viaBelastbaarReferentie_geeftJuistBedrag() {
        Belastbaar belastbaar = new Motorboot("Merk", "Type", 13.75, "diesel");
        assertEquals(150.0, belastbaar.getVervoerBelasting(), 0.01);
    }
}
