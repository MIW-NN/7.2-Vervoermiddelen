package vervoermiddelen.project.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarTest {

    public static final String BRAND = "Audi";
    public static final String TYPE = "A1";
    public static final int WEIGHT = 1075;
    public static final String TYPE_OF_FUEL = "Benzine";

    @Test
    public void expectCarToContainValuesGivenAsString(){
        var car = new Car(BRAND, TYPE, WEIGHT,TYPE_OF_FUEL);
        var carString = car.toString();

        Assert.assertTrue(carString.contains(BRAND));
        Assert.assertTrue(carString.contains(TYPE));
        Assert.assertTrue(carString.contains(TYPE_OF_FUEL));
    }
}