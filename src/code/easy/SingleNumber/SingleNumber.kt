package code.easy.SingleNumber

private const val DUPLICATED_NUMBER = 1

class SingleNumber {

    fun singleNumber(nums: IntArray): Int =
        nums.first { x -> nums.count { it == x } == DUPLICATED_NUMBER }
}