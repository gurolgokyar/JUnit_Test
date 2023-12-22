package main.java.week_16;

public class AgeRestrictionValidator {

    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;
    public boolean isEligible(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }
}
