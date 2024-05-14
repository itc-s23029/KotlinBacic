package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    // Check03で作ったプログラムが、本当に確率通りか試してみる

    println("試行回数: ")
    val count = readln().toInt()

    //勝ち・負け・あいこ
    var win = 0
    var lose = 0
    var drew = 0

    for (i in 0 ..<count) {
        val player = Random.nextInt(1..3)
        print("1:グー 2:チョキ 3:パー を選んでください: $player")

        //
        val (result, judge) = when (Random.nextInt(0..<100)) {
            in 0..<10 -> {
                win++
                Pair(1, "勝ち")
            }
            in 10..<15 -> {
                drew++
                Pair(0, "あいこ")
            }
            else -> {
                lose++
                Pair(2, "負け")
            }
        }


        // CPUの手を計算で求める
        val cpu = (player + result) % 3

        //
        val judag = when (result) {
            0 -> "あいこ"
            1 -> "勝ち"
            else -> "負け"
        }

        //勝敗結果
        println("CPU: ${cpu + 1} ---$judag")
    }
    println("確率の結果")
    println("勝ち: $win (${win / count.toDouble() * 100}%)")
    println("負け: $lose (${lose / count.toDouble() * 100}%)")
    println("あいこ: $drew (${drew / count.toDouble() * 100}%)")
}