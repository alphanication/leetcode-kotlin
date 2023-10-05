package code.easy.MajorityElement

import org.junit.Assert.*
import org.junit.Test

class MajorityElementTest {

    @Test
    fun isMajorityElement1() {
        val inputNums = intArrayOf(3, 2, 3)
        val expectedValue = 3

        assertEquals(expectedValue, MajorityElement().majorityElement(nums = inputNums))
    }

    @Test
    fun isMajorityElement2() {
        val inputNums = intArrayOf(2,2,1,1,1,2,2)
        val expectedValue = 2

        assertEquals(expectedValue, MajorityElement().majorityElement(nums = inputNums))
    }

    @Test
    fun isMajorityElement3() {
        val inputNums = intArrayOf(3, 3, 4)
        val expectedValue = 3

        assertEquals(expectedValue, MajorityElement().majorityElement(nums = inputNums))
    }
}