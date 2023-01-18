package code.easy.ReverseInteger

private const val MINUS = "-"
private const val EMPTY_STRING = ""

class ReverseInteger {

    fun reverseInteger(integer: Int) : Int {
        return try {
            val symbol = if (integer > 0) 1 else -1
            Integer.parseInt(integer.toString().replace(MINUS, EMPTY_STRING).reversed()) * symbol
        } catch(e: Exception) {
            0
        }
    }
}