package code.easy

/** TODO: Vorobey Egor / 07.08.2022
 *
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1] */

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, item ->
            val found = map[target - item]
            found?.let { return intArrayOf(found, index) }
            map[item] = index
        }

        return DEFAULT_VALUE
    }

    companion object {
        private val DEFAULT_VALUE = intArrayOf(-1, -1)
    }
}