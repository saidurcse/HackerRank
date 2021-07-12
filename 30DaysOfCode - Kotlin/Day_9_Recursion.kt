import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun factorial(n: Int): Int {
    // Write your code here
    if(n == 0)
        return 0
    if(n == 1)
        return 1
    else
        return factorial(n-1)*n

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}
