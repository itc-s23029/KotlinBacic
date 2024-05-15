package org.example

import kotlin.time.measureTime

fun main(args: Array<String>) {
   run {
       println("----18.1----")
       val s: Set<String> = setOf("あ", "い", "う", "え", "お")
       println(s)
   }
    run {
        println("----18.2----")
        val s: MutableSet<String> = mutableSetOf("あ", "い", "う", "え", "お")
        s += "か"
        s += "き"
        s += "く"
        println(s)
    }
    run {
        println("----18.2----")
        val s = mutableSetOf("あ", "い", "う", "え", "お")
        s += "か"
        s += "き"
        s += "く"
        s += "い"
        s += "お"
        s += "か"
        println(s)
    }
    val charList = 'a'..'z'
    val searchContrList = mutableListOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
    val searchCharSet = mutableSetOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
    val count = 1_000_000_000L
    val listTime = measureTime {
        for (i in 0..<count) {
            val target = charList.shuffled()[0]
            println("「${target}」は存在する？ : ${target in searchContrList}")
        }
    }
    val setTime = measureTime {
        for (i in 0..<count) {
            val target = charList.shuffled()[0]
            println("「${target}」は存在する？ : ${target in searchCharSet}")
        }
    }
    println("Listでかかった時間: $listTime")
    println("Setでかかった時間: $setTime")
}