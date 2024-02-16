package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;


public class BikeTest {

    public static final String BRAND = "gazelle";
    public static final String TYPE = "Chamonix";
    public static final int WEIGHT = 100;

    @Test
    public void expectBikeToContainValuesGivenAsString(){
        var bike = new Bike(BRAND, TYPE, WEIGHT);
        var bikeString = bike.toString();

        Assert.assertTrue(bikeString.contains(BRAND));
        Assert.assertTrue(bikeString.contains(TYPE));
//        Assert.assertTrue(bikeString.contains("menskracht"));
    }
}