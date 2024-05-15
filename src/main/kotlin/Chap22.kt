package org.example

fun main(args: Array<String>) {
    /*run {
        println("----22.1----")
        val text = "あいうえお"
        val number = text.toUInt()
        println(number)
    }*/
    /*run {
       println("----22.2----")
        val text = "-12345"
        //何かの方法で text をチェックする
        //チェックの結果問題がなければ進む
        val number = text.toInt()
        println(number)
    }*/

    run {
        println("----22.3----")
       // println("input: ")
        val text = "readln()"
        try {
            val number = text.toInt()
            println("number = $number")
        } catch (e: NumberFormatException) {
            println("「${text}」という文字は整数値に変換できません")
        }
    }

    run {
        println("----22.4----")
        try {
            val number = args[0].toInt()
            println("number = $number")
        } catch (e: NumberFormatException) {
            println("「${args[0]}」という文字は整数値に変換できません")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("文字を入力してください")
        } catch (e: Exception) {
            println("想定外の何かが発生しました")
        }
    }

    run {
        println("----22.7----")
        println("input: ")
        val text = readln()
        try {
            val number = text.toInt()
            println("number = $number")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("文字を入力してください")
        } finally {
            println("ありがとう")
        }
    }
}