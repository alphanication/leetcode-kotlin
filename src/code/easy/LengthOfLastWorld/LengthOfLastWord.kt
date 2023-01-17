package code.easy.LengthOfLastWorld

private const val WHITESPACE = ' '

class LengthOfLastWord {

    fun lengthOfLastWord(str: String) : Int = str.trim().substringAfterLast(WHITESPACE).length
}