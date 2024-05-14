package org.example

fun main(args: Array<String>) {
    //横は 9 → 1, 縦は 1 → 9 の掛け算表を表示してください。
    val x = 9 downTo 1
    val y = 1..9

    //最初の見出しを出す
    println("  ")
    for (xi in x){
        println("$xi ")
    }
    println()
    //
    for (yi in y){
        println("$yi ")
        for (xi in x){
            println("${xi * yi} ")
        }
        println()
    }
}