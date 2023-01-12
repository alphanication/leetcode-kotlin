package code.easy.HappyNumber

import org.junit.Assert.*
import org.junit.Test
import kotlin.math.exp

class HappyNumberTest {

    @Test
    fun happyNumber1() {
        val inputNumber = 1
        val expectedAnswer = true

        assertEquals(expectedAnswer, HappyNumber().happyNumber(inputNumber))
    }

    @Test
    fun happyNumber2() {
        val inputNumber = 19
        val expectedAnswer = true

        assertEquals(expectedAnswer, HappyNumber().happyNumber(inputNumber))
    }

    @Test
    fun happyNumber3() {
        val inputNumber = 1871
        val expectedAnswer = false

        assertEquals(expectedAnswer, HappyNumber().happyNumber(inputNumber))
    }

    @Test
    fun happyNumber4() {
        val inputNumber = 62
        val expectedAnswer = false

        assertEquals(expectedAnswer, HappyNumber().happyNumber(inputNumber))
    }
}