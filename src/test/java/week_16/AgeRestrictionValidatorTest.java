package test.java.week_16;

import main.java.week_16.AgeRestrictionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgeRestrictionValidatorTest {

    AgeRestrictionValidator ageRestrictionValidator = new AgeRestrictionValidator();

    @Test
    void testIsEligibleWithAgeJustBelowMinimum(){
        boolean result = ageRestrictionValidator.isEligible(17);
        assertFalse(result);
    }

    @Test
    void testIsEligibleWithAgeAtMinimum(){
        boolean result = ageRestrictionValidator.isEligible(18);
        assertTrue(result);
    }

    @Test
    void testIsEligibleWithAgeJustAboveMinimumValue(){
        boolean result = ageRestrictionValidator.isEligible(19);
        assertTrue(result);
    }

    @Test
    void testIsEligibleWithValidValue(){
        boolean result = ageRestrictionValidator.isEligible(64);
        assertTrue(result);
    }

    @Test
    void testIsEligibleWithAgeJustBelowMaximum(){
        boolean result = ageRestrictionValidator.isEligible(64);
        assertTrue(result);
    }

    @Test
    void testIsEligibleWithAgeAtMaximumValue(){
        boolean result = ageRestrictionValidator.isEligible(65);
        assertTrue(result);
    }

    @Test
    void testIsEligibleWithAgeJustAboveMaximum(){
        boolean result = ageRestrictionValidator.isEligible(66);
        assertFalse(result);
    }

    @Test
    void testIsEligibleWithExtremeLowAge(){
        boolean result = ageRestrictionValidator.isEligible(0);
        assertFalse(result);
    }

    @Test
    void testIsEligibleWithExtremeHighAge(){
        boolean result = ageRestrictionValidator.isEligible(64);
        assertTrue(result);
    }


}
