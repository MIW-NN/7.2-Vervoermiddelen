package vervoermiddelen.project.controller;

import vervoermiddelen.project.model.*;

public class VervoersmiddelenLauncher {

    public static void main(String[] args) {

        Vervoermiddel[] vervoersmiddelen = new Vervoermiddel[5];

        vervoersmiddelen[0] = new Koets("Glinkowski", "marathonwagen", 320, 2);
        vervoersmiddelen[1] = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        vervoersmiddelen[2] = new Fiets("Koga Miyata", "Colmaro Race Ultegra", 9);
        vervoersmiddelen[3] = new Zeilboot("Dufour", "36 Classic", 11.5);
        vervoersmiddelen[4] = new Motorboot("Broesder", "Kotter", 13.75, "diesel");

        for (Vervoermiddel vervoermiddel : vervoersmiddelen) {
            System.out.println(vervoermiddel);
            System.out.println();
        }
    }
}
