package code.easy.TwoSum

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TwoSumTest {

    @Test
    fun twoSum1() {
        val expected = intArrayOf(0, 1)
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        assertArrayEquals(expected, TwoSum().twoSum(nums = nums, target = target))
    }

    @Test
    fun twoSum2() {
        val expected = intArrayOf(1, 2)
        val nums = intArrayOf(3, 2, 4)
        val target = 6

        assertArrayEquals(expected, TwoSum().twoSum(nums = nums, target = target))
    }

    @Test
    fun twoSum3() {
        val expected = intArrayOf(0, 1)
        val nums = intArrayOf(3, 3)
        val target = 6

        assertArrayEquals(expected, TwoSum().twoSum(nums = nums, target = target))
    }

    @Test
    fun twoSum4() {
        val expected = intArrayOf(2, 3)
        val nums = intArrayOf(1, 0, 6, 4)
        val target = 10

        assertArrayEquals(expected, TwoSum().twoSum(nums = nums, target = target))
    }
}