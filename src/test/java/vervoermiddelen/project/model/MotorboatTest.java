package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class MotorboatTest {

    public static final String BRAND = "Oud Huijzer";
    public static final String TYPE = "616 Tender";
    public static final double LENGTH = 6.16;
    public static final String TYPE_OF_FUEL = "Benzine";

    @Test
    public void expectMotorboatToContainValuesGivenAsString(){
        var motorboat = new Motorboat(BRAND, TYPE, LENGTH,TYPE_OF_FUEL);
        var moterboatString = motorboat.toString();

        Assert.assertTrue(moterboatString.contains(BRAND));
        Assert.assertTrue(moterboatString.contains(TYPE));
        Assert.assertTrue(moterboatString.contains(TYPE_OF_FUEL));
    }
}