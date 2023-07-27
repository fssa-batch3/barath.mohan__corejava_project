package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class UserValidatorTest {

    @Test
    public void testRegisterWithNullUser() {
        User user = null;
        try {
        	  
        	  UserValidator.register(user);
        }catch(UserAlreadyExistsException ex) {
        	assertEquals(ex.getMessage(),"User Object Cannot be Null");       	
        }      
    }

    @Test 
    public void testRegisterNewUser() {
        User user = new User(1, "b2hack", "b2hack@gmail.com");
        boolean result = UserValidator.register(user);
        assertTrue(result);
    }

}

