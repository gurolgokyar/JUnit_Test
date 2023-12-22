package test.java.week_16;

import main.java.week_16.ShippingCostCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostCalculatorTest {
    //(Destinations) local destination(1),  International destination(5)
    //(Weights)                                                               (Delivery Speed)
    //positive                                                                 Standard (valid) (1)
    //positive                                                                 Express  (valid) (2,5)
    //zero                                                                     Standard (invalid)
    //zero                                                                     Express  (invalid)
    //Negative                                                                 Standard (invalid)
    //Negative                                                                 Express  (invalid)
    ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();


    //Test positive weight
    @Test
    void testCalculateCostWithLocalDestinationAndStandardDeliveryAtPositiveValue() {
        double expected = 4;
        double actual = shippingCostCalculator.calculateCost(4, "local", "standard");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithInternationalDestinationAndStandardDeliveryAtPositiveValue() {
        double expected = 20;
        double actual = shippingCostCalculator.calculateCost(4, "international", "standard");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithLocalDestinationAndExpressDeliveryAtPositiveValue() {
        double expected = 4 * 2.5;
        double actual = shippingCostCalculator.calculateCost(4, "local", "express");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithInternationalDestinationAndExpressDeliveryAtPositiveValue() {
        double expected = 4 * 5 * 2.5;
        double actual = shippingCostCalculator.calculateCost(4, "international", "express");
        assertEquals(expected, actual);
    }


    //Test zero weight
    @Test
    void testCalculateCostWithLocalDestinationAndStandardDeliveryAtZeroValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(0, "local", "standard");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithInternationalDestinationAndStandardDeliveryAtZeroValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(0, "international", "standard");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithLocalDestinationAndExpressDeliveryAtZeroValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(0, "local", "express");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithInternationalDestinationAndExpressAtDeliveryZeroValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(0, "international", "express");
        assertEquals(expected, actual);
    }


    //Test negative weight
    @Test
    void testCalculateCostWithLocalDestinationAndStandardDeliveryAtNegativeValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(-1, "local", "standard");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithInternationalDestinationAndStandardDeliveryAtNegativeValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(-1, "international", "standard");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithLocalDestinationAndExpressDeliveryAtNegativeValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(-1, "local", "express");
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateCostWithInternationalDestinationAndExpressDeliveryAtNegativeValue() {
        double expected = 0;
        double actual = shippingCostCalculator.calculateCost(-1, "international", "express");
        assertEquals(expected, actual);
    }

}
