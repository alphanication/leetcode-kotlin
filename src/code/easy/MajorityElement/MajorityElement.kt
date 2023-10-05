package code.easy.MajorityElement

// TODO: Vorobey Egor / 15.03.2022

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        return nums.toList().groupingBy { it }.eachCount().maxBy { it.value }.key
    }
}