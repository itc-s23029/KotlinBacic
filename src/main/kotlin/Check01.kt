package org.example

fun main(args: Array<String>) {
    println("成績を入力してください")
    val score = readln().toInt()

    // 成績判定
    // 0 ~ 59 は D
    // 60 ~ 69 は C
    // 70 ~ 79 は B
    // 80 ~ 89 は A
    // 90 ~ 100 は S
    // それ以外は「エラー」と出力

    println("パターン１")
    val message = if (score in 0..59) {
        "成績はDです"
    } else if (score in 60..69) {
        "成績はCです"
    } else if (score in 70..79) {
        "成績はBです"
    } else if (score in 80..89) {
        "成績はAです"
    } else if (score in 90..100) {
        "成績はSです"
    }else {
        "「エラー」"
    }
    println(message)

    println("パターン２")
    val metadata1 = when {
        (score in 0..59) -> println("成績はDです")
        (score in 60..69) -> println("成績はCです")
        (score in 70..79) -> println("成績はBです")
        (score in 80..89) -> println("成績はAです")
        (score in 90..100) -> println("成績はSです")
        else -> println("「エラー」")
    }

    println("パターン３")
    val rank2 = if (score !in 0..  100) { //それ(0~100)以外は「エラー」と出力
        "エラー"
    } else if (score < 60) {
        "D"
    } else if (score < 70) {
        "C"
    } else if (score < 80) {
        "B"
    } else if (score < 90) {
        "A"
    } else {
        "S"
    }
    println(rank2)

    println("パターン４")
    val rank3 = when (score) {
        !in 0..100 -> "エラー"
        in 0..<60 -> "D"
        in 60..<70 -> "C"
        in 70..<80 -> "B"
        in 80..<90 -> "A"
        else -> "S"
    }
    println(rank3)

    println("パターン5")
    val rank4 = when (score) {
        in 0..<60 -> "D"
        in 60..<70 -> "C"
        in 70..<80 -> "B"
        in 80..<90 -> "A"
        in 90..<100 -> "S"
        else -> "エラー"
    }
    println(rank4)
}