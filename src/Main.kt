import java.util.Scanner
import kotlin.math.hypot

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    helloPrint()

//    sayHello("Nodir")

//    meetting("Nodir", 15)

//    val suum = sum(4, 9)
//    println(suum)

//    isPair(116)
//    println(kvadrat(5))
}

// oddiy funksiya
fun helloPrint() {
    println("Hello Teacher")
    println("Hello World!")
}

// parametrli funksiya
fun sayHello(name: String) {
    println("Hello $name")
}

//murakkab parametrli
fun meetting(name: String, age: Int) {
    println("Your name $name. Your age $age")
}

//QIymat qyaytaradigan
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun isPair(n: Int): Boolean {
    return n % 2 == 0

}

fun kvadrat(a: Int): Int {
    return a * a
}

