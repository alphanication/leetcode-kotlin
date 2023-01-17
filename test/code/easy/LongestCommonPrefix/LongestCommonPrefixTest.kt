package code.easy.LongestCommonPrefix

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefix1() {
        val inputArrayStr = arrayOf("flower", "flow", "flight")
        val expectedPrefix = "fl"

        assertEquals(
            expectedPrefix,
            LongestCommonPrefix().longestCommonPrefix(strs = inputArrayStr)
        )
    }

    @Test
    fun longestCommonPrefix2() {
        val inputArrayStr = arrayOf("dog", "racecar", "car")
        val expectedPrefix = ""

        assertEquals(
            expectedPrefix,
            LongestCommonPrefix().longestCommonPrefix(strs = inputArrayStr)
        )
    }

    @Test
    fun longestCommonPrefix3() {
        val inputArrayStr = arrayOf("a")
        val expectedPrefix = "a"

        assertEquals(
            expectedPrefix,
            LongestCommonPrefix().longestCommonPrefix(strs = inputArrayStr)
        )
    }

    @Test
    fun longestCommonPrefix4() {
        val inputArrayStr = arrayOf("acc", "aaa", "aaba")
        val expectedPrefix = "a"

        assertEquals(
            expectedPrefix,
            LongestCommonPrefix().longestCommonPrefix(strs = inputArrayStr)
        )
    }

    @Test
    fun longestCommonPrefix5() {
        val inputArrayStr = arrayOf("aaa", "aaa", "aaa")
        val expectedPrefix = "aaa"

        assertEquals(
            expectedPrefix,
            LongestCommonPrefix().longestCommonPrefix(strs = inputArrayStr)
        )
    }

    @Test
    fun longestCommonPrefix6() {
        val inputArrayStr = arrayOf("acd", "acd", "acbd")
        val expectedPrefix = "ac"

        assertEquals(
            expectedPrefix,
            LongestCommonPrefix().longestCommonPrefix(strs = inputArrayStr)
        )
    }
}