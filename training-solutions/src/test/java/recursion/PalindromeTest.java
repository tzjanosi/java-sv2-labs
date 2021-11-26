package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertEquals(true, palindrome.isPalindrome("racecar"));
        assertEquals(true, palindrome.isPalindrome("abba"));
        assertEquals(false, palindrome.isPalindrome("abcd"));
        assertEquals(false, palindrome.isPalindrome("abc"));
        assertEquals(true, palindrome.isPalindrome("a"));
        assertEquals(true, palindrome.isPalindrome(""));
    }
}