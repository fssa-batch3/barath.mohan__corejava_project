package day10.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void testValidEmail() {
        // Valid email should not throw an exception
        String validEmail = "test@example.com";
        try {
            assertTrue(EmailValidator.validEmail(validEmail));
        } catch (InvalidEmailException e) {
            fail("Unexpected InvalidEmailException for valid email");
        }
    }

    @Test
    void testInvalidEmail() {
        // Invalid email should throw InvalidEmailException
        String invalidEmail = "invalid-email";
        assertThrows(InvalidEmailException.class, () -> EmailValidator.validEmail(invalidEmail));
    }

    @Test
    void testNullEmail() {
        // Null email should throw InvalidEmailException
        String nullEmail = null;
        assertThrows(InvalidEmailException.class, () -> EmailValidator.validEmail(nullEmail));
    }
}

