package com.example.chap32


fun main(args: Array<String>) {
    run {
    /*    println("----32.1----")
        var text: String = "あいうえお"
        text = null
        println("文字列「${text}」の長さ = ${text.length}")*/
    }

    run {
        println("----32.2----")
        var text: String? = "あいうえお"
        text = null
        println("文字列「${text}」の長さ = ${text?.length}")
    }

    run {
        println("----32.9----")
        var text_a: String = "あいうえお"
        var text_b: String? = "あいうえお"
        var length_a = contTextLength1(text_a)
        var length_b = contTextLength1(text_b!!)
//        var lenget_n = contTextLength1(null)
//        text_b = null
//        length_b = contTextLength1(text_b!!)
    }

    run {
        println("----32.12----")
        val list: List<String?> = listOf("あ", "い","う", null,"お")
        for (text in list) {
            if (text != null) {
                println("${text}の長さ ${text.length}")
            }
        }
    }

    run {
        println("----32.13----")
        val list: List<String?> = listOf("あ", "い", "う", null, "お")
        for (text in list) {
            text?.let {
                println("${it}の長さ ${it.length}")
            }
        }
    }
}

fun contTextLength1(text: String): Int {
    return text.length
}

fun contTextLength2(text: String?): Int {
    if (text != null) {
        return text.length
    } else {
        return 0
    }
}

fun contTextLength3(text: String?): Int {
    return text?.length ?: 0
}

