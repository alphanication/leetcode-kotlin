package code.easy.ReverseInteger

import org.junit.Assert.*
import org.junit.Test

class ReverseIntegerTest {

    @Test
    fun reverseInteger1() {
        val inputInt = 123
        val expectedInt = 321

        assertEquals(expectedInt, ReverseInteger().reverseInteger(inputInt))
    }

    @Test
    fun reverseInteger2() {
        val inputInt = 120
        val expectedInt = 21

        assertEquals(expectedInt, ReverseInteger().reverseInteger(inputInt))
    }

    @Test
    fun reverseInteger3() {
        val inputInt = 0
        val expectedInt = 0

        assertEquals(expectedInt, ReverseInteger().reverseInteger(inputInt))
    }

    @Test
    fun reverseInteger4() {
        val inputInt = -123
        val expectedInt = -321

        assertEquals(expectedInt, ReverseInteger().reverseInteger(inputInt))
    }
}