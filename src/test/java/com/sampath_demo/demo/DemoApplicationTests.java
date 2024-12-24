package com.sampath_demo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

  private final DemoApplication demoApplication = new DemoApplication();

    @Test
    void testAddNumbers() {
        assertEquals(5, demoApplication.addNumbers(2, 3));
        assertEquals(0, demoApplication.addNumbers(-2, 2));
        assertEquals(-5, demoApplication.addNumbers(-2, -3));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(demoApplication.isPalindrome("madam"));
        assertTrue(demoApplication.isPalindrome("Racecar"));
        assertFalse(demoApplication.isPalindrome("hello"));
        assertFalse(demoApplication.isPalindrome(null));
    }

    @Test
    void testFactorial() {
        assertEquals(1, demoApplication.factorial(0));
        assertEquals(1, demoApplication.factorial(1));
        assertEquals(120, demoApplication.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> demoApplication.factorial(-1));
    }

    @Test
    void testFindMax() {
        assertEquals(10, demoApplication.findMax(new int[]{1, 3, 10, 2}));
        assertEquals(3, demoApplication.findMax(new int[]{3}));
        assertThrows(IllegalArgumentException.class, () -> demoApplication.findMax(null));
        assertThrows(IllegalArgumentException.class, () -> demoApplication.findMax(new int[]{}));
    }

    @Test
    void testIsValidEmail() {
        assertTrue(demoApplication.isValidEmail("test@example.com"));
        assertTrue(demoApplication.isValidEmail("user.name@domain.co.uk"));
        assertFalse(demoApplication.isValidEmail("invalid-email"));
        assertFalse(demoApplication.isValidEmail("user@.com"));
        assertFalse(demoApplication.isValidEmail(null));
    }
}
