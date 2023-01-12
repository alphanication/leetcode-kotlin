package code.easy.HappyNumber

// TODO: Vorobey Egor / 12.01.2023

class HappyNumber {

    fun happyNumber(number: Int): Boolean = isHappyHelper(number, hashSetOf())

    private fun isHappyHelper(n: Int, oldResults: HashSet<Int>): Boolean {
        if (n == 1) return true

        val calcSum: Int = calculateSum(n)
        if (oldResults.contains(calcSum)) return false

        oldResults.add(calcSum)
        return isHappyHelper(calcSum, oldResults)
    }

    private fun calculateSum(n: Int): Int {
        var remaining = n
        var result = 0
        var digit = 0

        while (remaining > 0) {
            digit = remaining % 10
            result += digit * digit
            remaining /= 10
        }

        return result
    }
}