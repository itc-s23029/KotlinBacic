package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    print("1:グー 2:チョキ 3:パー を選んでください: ")
    // 入力は、1,2,3ですが、0,1,2となるように工夫してください
    val player = readln().toInt() -1

    //CPUの手をランダムで決める
    val cpu = Random.nextInt(0, 3) //0,1,2 のどれかになる

    //　勝敗判定
    println("パターン１")
    val jucge = when {
        player == cpu-> "あいこ"
        player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0-> "勝ち"
        player == 0 && cpu == 2 || player == 1 && cpu == 0 || player == 2 && cpu == 1 -> "負け"
        else -> "?"
    }

    println("パターン２")
    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "負け"
        2 -> "勝ち"
        else -> "?"
    }
    

    // 勝敗の結果表示(プレイヤー視点)
    println("CPU: ${cpu + 1} ---$jucge")
    // 勝ち
    // 負け
    // あいこ
}