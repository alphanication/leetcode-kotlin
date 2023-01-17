package code.easy.SingleNumber

import org.junit.Assert.assertEquals
import org.junit.Test

class SingleNumberTest {

    @Test
    fun singleNumber1() {
        val nums = intArrayOf(2, 2, 1)
        val expectedNumber = 1

        assertEquals(expectedNumber, SingleNumber().singleNumber(nums))
    }

    @Test
    fun singleNumber2() {
        val nums = intArrayOf(2, 4, 3, 3, 4)
        val expectedNumber = 2

        assertEquals(expectedNumber, SingleNumber().singleNumber(nums))
    }

    @Test
    fun singleNumber3() {
        val nums = intArrayOf(1)
        val expectedNumber = 1

        assertEquals(expectedNumber, SingleNumber().singleNumber(nums))
    }

    @Test
    fun singleNumber4() {
        val nums = intArrayOf(4, 1, 2, 1, 2)
        val expectedNumber = 4

        assertEquals(expectedNumber, SingleNumber().singleNumber(nums))
    }
}