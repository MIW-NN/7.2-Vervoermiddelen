package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class SailboatTest {

    public static final String BRAND = "beneteau";
    public static final String TYPE = "Kielboot";
    public static final double LENGTH = 9.99;

    @Test
    public void expectSailboatToContainValuesGivenAsString(){
        var sailboat = new Sailboat(BRAND, TYPE, LENGTH);
        var sailboatString = sailboat.toString();

        Assert.assertTrue(sailboatString.contains(BRAND));
        Assert.assertTrue(sailboatString.contains(TYPE));
//        Assert.assertTrue(sailboatString.contains("windkracht"));
    }
}