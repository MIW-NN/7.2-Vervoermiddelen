package vervoermiddelen.project.controller;

import vervoermiddelen.project.model.*;

import java.util.ArrayList;

public class VervoersmiddelenLauncher {

    public static void main(String[] args) {

        ArrayList<Vervoermiddel> vervoersmiddelen = new ArrayList<>();

        vervoersmiddelen.add(new Koets("Glinkowski", "marathonwagen", 320, 2));
        vervoersmiddelen.add(new Auto("Dacia", "Logan MPV", 1150, "benzine"));
        vervoersmiddelen.add(new Fiets("Koga Miyata", "Colmaro Race Ultegra", 9));
        vervoersmiddelen.add(new Zeilboot("Dufour", "36 Classic", 11.5));
        vervoersmiddelen.add(new Motorboot("Broesder", "Kotter", 13.75, "diesel"));
        vervoersmiddelen.add(new Auto("Tesla", "Model S 100D", 2200, "elektrische"));

        for (Vervoermiddel vervoermiddel : vervoersmiddelen) {
            System.out.println(vervoermiddel);

            if (vervoermiddel instanceof Belastbaar) {
                System.out.printf("%.2f euro belasting per kwartaal\n", ((Belastbaar) vervoermiddel).getVervoerBelasting());
            }

            System.out.println();
        }
    }
}
