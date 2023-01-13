package code.easy.PlusOne

private const val EMPTY_STRING = ""

class PlusOne {

    fun plusOne(originalNumberArray: IntArray): IntArray {
        var currentNumberStr = EMPTY_STRING
        originalNumberArray.toList().forEach { currentNumberStr += it.toString() }
        return (currentNumberStr.toInt() + 1).toString().map { it.toString().toInt() }.toIntArray()
    }
}