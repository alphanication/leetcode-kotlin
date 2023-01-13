package code.easy.ValidParentheses

import java.util.*

// TODO: Vorobey Egor / 12.08.2022

class ValidParentheses {

    fun isValid(s: String): Boolean {
        val hashMapParentheses = hashMapEqualsParentheses()
        var stack = Stack<String>()
        s.forEach {
            when (it.toString()) {
                "{" -> stack.push(hashMapParentheses[it].toString())
                "(" -> stack.push(hashMapParentheses[it].toString())
                "[" -> stack.push(hashMapParentheses[it].toString())
                else -> if (stack.isEmpty() || stack.pop() != it.toString()) return false
            }
        }

        return stack.isEmpty()
    }

    fun hashMapEqualsParentheses(): HashMap<Char, Char> {
        val hashMapParentheses = HashMap<Char, Char>()
        hashMapParentheses['('] = ')'
        hashMapParentheses['{'] = '}'
        hashMapParentheses['['] = ']'

        return hashMapParentheses
    }
}