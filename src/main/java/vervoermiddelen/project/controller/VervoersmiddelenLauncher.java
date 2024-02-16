package vervoermiddelen.project.controller;

import vervoermiddelen.project.model.*;

public class VervoersmiddelenLauncher {

    public static void main(String[] args) {
        MeansOfTransport[] meansOfTransportation = new MeansOfTransport[5];
        meansOfTransportation[0] = new Coach("Glinkowski", "marathonwagen", 320, 2);
        meansOfTransportation[1] = new Car("Dacia", "Logan", 1150, "benzine");
        meansOfTransportation[2] = new Bike("Koga Mijata", "Colmaro Race Ultegra", 9);
        meansOfTransportation[3] = new Sailboat("Dufour", "36 Classic", 11.5);
        meansOfTransportation[4] = new Motorboat("Broesder", "Kotter", 13.75, "diesel");

        for (int index = 0; index < meansOfTransportation.length; index++) {
            System.out.println(meansOfTransportation[index]);
        }
    }
}
