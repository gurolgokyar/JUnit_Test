package test.java.week_16;

import main.java.week_16.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginValidatorTest {
    LoginValidator loginValidator = new LoginValidator();

    //Test Cases for validateUsername Method
    @Test
    void testUserNameWithValidEmailAddress(){
        boolean result = loginValidator.validateUsername("gurolgggg@gmail.com");
        assertTrue(result);
    }

    @Test
    void testUserNameWithoutASymbol(){
        boolean result = loginValidator.validateUsername("gurolggggmail.com");
        assertFalse(result);
    }

    @Test
    void testUserNameWithoutDomain(){
        boolean result = loginValidator.validateUsername("gurol@fgh");
        assertFalse(result);
    }

    @Test
    void  testUserNameWithInvalidCharacters(){
        boolean result = loginValidator.validateUsername("gurolé@gmail.com");
        assertFalse(result);
    }

    @Test
    void  testUserNameWithEmptyLength(){
        boolean result = loginValidator.validateUsername("");
        assertFalse(result);
    }

    @Test
    void  testUserNameWithNullValue(){
        boolean result = loginValidator.validateUsername(null);
        assertFalse(result);
    }

    //Test Cases for validate passwords methods
    @Test
    void testValidatePassWordWithValidPassWord(){
        boolean result = loginValidator.validatePassword("ghjkf23&");
        assertTrue(result);
    }

    @Test
    void testValidatePassWordWithoutSpecialCharacter(){
        boolean result = loginValidator.validatePassword("abcdfghjkf23");
        assertFalse(result);
    }
    @Test
    void testValidatePassWordWithoutNumber(){
        //Special Characters = !@#$%^&*
        boolean result = loginValidator.validatePassword("abcdfghjkf&");
        assertFalse(result);
    }

    @Test
    void testValidatePassWordTooShort(){
        boolean result = loginValidator.validatePassword("!jkf23&");
        assertFalse(result);
    }

    @Test
    void testValidatePassWordTooLong(){
        boolean result = loginValidator.validatePassword("abcdfghjkf23&34lk");
        assertFalse(result);
    }

    @Test
    void testValidatePassWordWithEmptyString(){
        boolean result = loginValidator.validatePassword("");
        assertFalse(result);
    }

    @Test
    void testValidatePassWordWithNullValue(){
        boolean result = loginValidator.validateUsername(null);
        assertFalse(result);
    }

}
