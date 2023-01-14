package code.easy.SearchInsertPosition

class SearchInsertPosition {

    fun searchInsertPosition(nums: IntArray, target: Int): Int {
        return nums.indexOf(closestValue(nums, target)) + 1
    }

    private fun closestValue(nums: IntArray, target: Int): Int =
        nums.filter { it < target }.minByOrNull { target - it } ?: 0
}