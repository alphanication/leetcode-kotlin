package code.easy.LongestCommonPrefix

// TODO: Vorobey Egor / 10.08.2022

const val EMPTY_STRING = ""

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return EMPTY_STRING
        }
        if (strs.size == 1) {
            return strs[0]
        }

        strs.sort()
        val commonPrefixOneTwo = strs[0].commonPrefixWith(strs[1])

        return commonPrefixOneTwo.commonPrefixWith(strs.last())
    }
}