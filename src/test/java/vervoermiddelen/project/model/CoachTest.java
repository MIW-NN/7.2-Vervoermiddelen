package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class CoachTest {

    public static final String BRAND = "UGears";
    public static final String TYPE = "URG-70032";
    public static final int WEIGHT = 1;
    public static final int AMOUNT_OF_HORSES = 2;

    @Test
    public void expectCoachToContainValuesGivenAsString(){
        var coach = new Coach(BRAND, TYPE, WEIGHT,AMOUNT_OF_HORSES);
        var coachString = coach.toString();

        Assert.assertTrue(coachString.contains(BRAND));
        Assert.assertTrue(coachString.contains(TYPE));
        Assert.assertTrue(coachString.contains(String.valueOf(AMOUNT_OF_HORSES)));
    }
}