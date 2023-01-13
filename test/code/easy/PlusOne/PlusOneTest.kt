package code.easy.PlusOne

import org.junit.Assert.*
import org.junit.Test

private const val EMPTY_STRING = ""

class PlusOneTest {

    @Test
    fun plusOne1() {
        val inputArray = intArrayOf(9)
        val expectedArray = intArrayOf(10)

        var actualNumberStr = EMPTY_STRING
        PlusOne().plusOne(inputArray).forEach { actualNumberStr += it.toString() }

        var expectedMumberStr = EMPTY_STRING
        expectedArray.forEach { expectedMumberStr += it.toString() }

        assertEquals(expectedMumberStr, actualNumberStr)
    }

    @Test
    fun plusOne2() {
        val inputArray = intArrayOf(1, 2, 3)
        val expectedArray = intArrayOf(1, 2, 4)

        var actualNumberStr = EMPTY_STRING
        PlusOne().plusOne(inputArray).forEach { actualNumberStr += it.toString() }

        var expectedMumberStr = EMPTY_STRING
        expectedArray.forEach { expectedMumberStr += it.toString() }

        assertEquals(expectedMumberStr, actualNumberStr)
    }

    @Test
    fun plusOne3() {
        val inputArray = intArrayOf(2, 2, 5)
        val expectedArray = intArrayOf(2, 2, 6)

        var actualNumberStr = EMPTY_STRING
        PlusOne().plusOne(inputArray).forEach { actualNumberStr += it.toString() }

        var expectedMumberStr = EMPTY_STRING
        expectedArray.forEach { expectedMumberStr += it.toString() }

        assertEquals(expectedMumberStr, actualNumberStr)
    }

    @Test
    fun plusOne4() {
        val inputArray = intArrayOf(2, 9)
        val expectedArray = intArrayOf(30)

        var actualNumberStr = EMPTY_STRING
        PlusOne().plusOne(inputArray).forEach { actualNumberStr += it.toString() }

        var expectedMumberStr = EMPTY_STRING
        expectedArray.forEach { expectedMumberStr += it.toString() }

        assertEquals(expectedMumberStr, actualNumberStr)
    }
}