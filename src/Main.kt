//Exercise 1
/*class Rectangle (val length: Double, val width: Double)
fun main(){
    val myRectangle = Rectangle(4.0, 5.0)
    fun Rectangle.perimeter(): Double{
        return 2*(length+width)
    }
    println("The Rectangle perimeter is ${myRectangle.perimeter()}")
}
*/

//Exercise 2
/*
class Palindrome (val word: String)
fun String.isPalindrome(): Boolean{
    return this == this.reversed()
}
fun main(){
    val word = "foam"
    println("Is \"$word\" a palindrome? ${word.isPalindrome()}")
}
 */

//Exercise 3
fun Int.isPrime(): Boolean {
    if (this <= 1) return false
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    val num = 44
    println("$num is prime: ${num.isPrime()}")
}
