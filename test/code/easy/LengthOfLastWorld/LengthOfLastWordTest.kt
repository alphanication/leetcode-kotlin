package code.easy.LengthOfLastWorld

import org.junit.Assert.assertEquals
import org.junit.Test

class LengthOfLastWordTest {

    @Test
    fun lengthOfLastWord1() {
        val inputStr = "   fly me  "
        val expectedLengthLastWord = 2

        assertEquals(expectedLengthLastWord, LengthOfLastWord().lengthOfLastWord(inputStr))
    }

    @Test
    fun lengthOfLastWord2() {
        val inputStr = "per aspera ad astra"
        val expectedLengthLastWord = 5

        assertEquals(expectedLengthLastWord, LengthOfLastWord().lengthOfLastWord(inputStr))
    }

    @Test
    fun lengthOfLastWord3() {
        val inputStr = "simplest way"
        val expectedLengthLastWord = 3

        assertEquals(expectedLengthLastWord, LengthOfLastWord().lengthOfLastWord(inputStr))
    }
}