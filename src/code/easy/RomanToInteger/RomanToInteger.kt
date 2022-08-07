package code.easy.RomanToInteger

// TODO: Vorobey Egor / 07/08/2022

class RomanToInteger {

    fun romanToInt(s: String): Int {
        val romanInteger = returnHashMapRomanInteger()
        var result = 0
        for (i in s.indices) {
            if (i != s.length - 1 && romanInteger[s[i]]!! < romanInteger[s[i + 1]]!!) result -= romanInteger[s[i]]!!
            else result += romanInteger[s[i]]!!
        }

        return result
    }

    fun returnHashMapRomanInteger() : HashMap<Char, Int> {
        val romanInteger = HashMap<Char, Int>()
        romanInteger['I'] = 1
        romanInteger['V'] = 5
        romanInteger['X'] = 10
        romanInteger['L'] = 50
        romanInteger['C'] = 100
        romanInteger['D'] = 500
        romanInteger['M'] = 1000

        return romanInteger
    }
}