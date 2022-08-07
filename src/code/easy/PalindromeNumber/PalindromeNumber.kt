package code.easy.PalindromeNumber

// TODO: Vorobey Egor / 07.08.2022

class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean = x.toString() == x.toString().reversed()
}