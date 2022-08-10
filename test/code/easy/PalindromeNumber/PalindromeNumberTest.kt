package code.easy.PalindromeNumber

import org.junit.Test

import org.junit.Assert.*

class PalindromeNumberTest {

    @Test
    fun isPalindrome1() {
        val inputNumber = 121
        assertTrue(PalindromeNumber().isPalindrome(x = inputNumber))
    }

    @Test
    fun isPalindrome2() {
        val inputNumber = -121
        assertFalse(PalindromeNumber().isPalindrome(x = inputNumber))
    }

    @Test
    fun isPalindrome3() {
        val inputNumber = 10
        assertFalse(PalindromeNumber().isPalindrome(x = inputNumber))
    }

    @Test
    fun isPalindrome4() {
        val inputNumber = 242
        assertTrue(PalindromeNumber().isPalindrome(x = inputNumber))
    }

    @Test
    fun isPalindrome5() {
        val inputNumber = 1
        assertTrue(PalindromeNumber().isPalindrome(x = inputNumber))
    }
}