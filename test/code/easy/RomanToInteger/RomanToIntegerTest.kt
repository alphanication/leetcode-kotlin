package code.easy.RomanToInteger

import org.junit.Assert.assertEquals
import org.junit.Test

class RomanToIntegerTest {

    @Test
    fun romanToInt1() {
        val romanNumber = "IV"
        val decimalExpectedNumber = 4

        assertEquals(decimalExpectedNumber, RomanToInteger().romanToInt(s = romanNumber))
    }

    @Test
    fun romanToInt2() {
        val romanNumber = "XXII"
        val decimalExpectedNumber = 22

        assertEquals(decimalExpectedNumber, RomanToInteger().romanToInt(s = romanNumber))
    }

    @Test
    fun romanToInt3() {
        val romanNumber = "XXVI"
        val decimalExpectedNumber = 26

        assertEquals(decimalExpectedNumber, RomanToInteger().romanToInt(s = romanNumber))
    }

    @Test
    fun romanToInt4() {
        val romanNumber = "IX"
        val decimalExpectedNumber = 9

        assertEquals(decimalExpectedNumber, RomanToInteger().romanToInt(s = romanNumber))
    }

    @Test
    fun romanToInt5() {
        val romanNumber = "DC"
        val decimalExpectedNumber = 600

        assertEquals(decimalExpectedNumber, RomanToInteger().romanToInt(s = romanNumber))
    }

    @Test
    fun romanToInt6() {
        val romanNumber = "MCMXCIV"
        val decimalExpectedNumber = 1994

        assertEquals(decimalExpectedNumber, RomanToInteger().romanToInt(s = romanNumber))
    }

    @Test
    fun testEqualsRomainToIntegerHashMap() {
        assertEquals(1, RomanToInteger().returnHashMapRomanInteger()['I'])
        assertEquals(5, RomanToInteger().returnHashMapRomanInteger()['V'])
        assertEquals(10, RomanToInteger().returnHashMapRomanInteger()['X'])
        assertEquals(50, RomanToInteger().returnHashMapRomanInteger()['L'])
        assertEquals(100, RomanToInteger().returnHashMapRomanInteger()['C'])
        assertEquals(500, RomanToInteger().returnHashMapRomanInteger()['D'])
        assertEquals(1000, RomanToInteger().returnHashMapRomanInteger()['M'])
    }
}