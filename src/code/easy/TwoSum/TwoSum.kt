package code.easy.TwoSum

// TODO: Vorobey Egor / 07.08.2022

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