package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

    public static final String BRAND = "Audi";
    public static final String TYPE = "A1";
    public static final int WEIGHT = 1075;
    public static final String TYPE_OF_FUEL = "Benzine";

    @Test
    public void expectCarToContainValuesGivenAsString(){
        var car = new Auto(BRAND, TYPE, WEIGHT,TYPE_OF_FUEL);
        var carString = car.toString();

        Assert.assertTrue(carString.contains(BRAND));
        Assert.assertTrue(carString.contains(TYPE));
        Assert.assertTrue(carString.contains(TYPE_OF_FUEL));
    }
}