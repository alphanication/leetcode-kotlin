package code.easy.ValidParentheses

import org.junit.Assert.*
import org.junit.Test

class ValidParenthesesTest {

    @Test
    fun isValid1() {
        val stringIsValid = "()"
        assertTrue(ValidParentheses().isValid(s = stringIsValid))
    }

    @Test
    fun isValid2() {
        val stringIsValid = "()[]{}"
        assertTrue(ValidParentheses().isValid(s = stringIsValid))
    }

    @Test
    fun isValid3() {
        val stringIsNotValid = "(]"
        assertFalse(ValidParentheses().isValid(s = stringIsNotValid))
    }

    @Test
    fun isValid4() {
        val stringIsNotValid = "([)]"
        assertFalse(ValidParentheses().isValid(s = stringIsNotValid))
    }

    @Test
    fun isValid5() {
        val stringIsNotValid = "{[]}"
        assertTrue(ValidParentheses().isValid(s = stringIsNotValid))
    }

    @Test
    fun hashMapEqualsParentheses() {
        assertEquals(')', ValidParentheses().hashMapEqualsParentheses()['('])
        assertEquals('}', ValidParentheses().hashMapEqualsParentheses()['{'])
        assertEquals(']', ValidParentheses().hashMapEqualsParentheses()['['])
    }
}