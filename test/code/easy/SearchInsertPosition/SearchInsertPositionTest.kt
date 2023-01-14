package code.easy.SearchInsertPosition

import org.junit.Assert.assertEquals
import org.junit.Test

class SearchInsertPositionTest {

    @Test
    fun searchInsertPosition1() {
        val inputNums = intArrayOf(1, 3, 5, 6)
        val targetNumber = 5
        val expectedIndex = 2

        assertEquals(
            expectedIndex,
            SearchInsertPosition().searchInsertPosition(inputNums, targetNumber)
        )
    }

    @Test
    fun searchInsertPosition2() {
        val inputNums = intArrayOf(1, 3, 5, 6)
        val targetNumber = 2
        val expectedIndex = 1

        assertEquals(
            expectedIndex,
            SearchInsertPosition().searchInsertPosition(inputNums, targetNumber)
        )
    }

    @Test
    fun searchInsertPosition3() {
        val inputNums = intArrayOf(1, 3, 5, 6)
        val targetNumber = 7
        val expectedIndex = 4

        assertEquals(
            expectedIndex,
            SearchInsertPosition().searchInsertPosition(inputNums, targetNumber)
        )
    }

    @Test
    fun searchInsertPosition4() {
        val inputNums = intArrayOf(1, 8, 9, 29)
        val targetNumber = 30
        val expectedIndex = 4

        assertEquals(
            expectedIndex,
            SearchInsertPosition().searchInsertPosition(inputNums, targetNumber)
        )
    }
}