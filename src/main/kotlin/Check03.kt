package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    // 勝ちが1割、負けが8.5割、あいこ0.5割となる
    // CPUを実装したじゃんけんを作ってください

    print("1:グー 2:チョキ 3:パー を選んでください: ")
    val player = readln().toInt() -1

    //乱数で勝敗を決める
    val result = when (Random.nextInt(0, 100)) { //0,1,2 のどれかになる
        in 0..<10 -> 1 // 勝ち
        in 10..<15 -> 0 // あいこ
        else -> 2 // 負け
    }

    // CPUの手を計算で求める
    val cpu = (player + result) % 3

    //
    val judag = when(result) {
        0 -> "あいこ"
        1 -> "勝ち"
        else -> "負け"
    }

    //勝敗結果
    println("CPU: ${cpu + 1} ---$judag")
}