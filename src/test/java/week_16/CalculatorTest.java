package test.java.week_16;

import main.java.week_16.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
   @Test
    void testAddition(){
       //Arrange
       Calculator calculator = new Calculator();

       //Act
       int result = calculator.add(2, 3);

       //Assert
       assertEquals(5, result, "2 + 3 should equal 5");
   }

}
