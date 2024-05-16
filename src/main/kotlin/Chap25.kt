package com.example.chap25


fun main(args: Array<String>) {
    run {
        println("----25.2----")
        val p = Person2("こうだい", 20)
        p.greet()
    }

    run {
        println("----25.5----")
        val p = Person2(name = "きいち", age = 19)
        p.greet()
    }

    run {
        println("----25.6----")
        val p = Person2(age = 19, name = "ゆうと")
        p.greet()
    }

    run {
        println("----25.6.1----")
        val p = Person2(name = "タケシ")
        p.greet()
    }

    run {
        println("----25.6.2----")
        val p = Person2(age = 20)
        p.greet()
    }

    run {
        println("----25.7----")
        val p1 = Person7()
        val p2 = Person7(name = "タケシ")
        val p3 = Person7(age = 7)
        p1.greet()
        p2.greet()
        p3.greet()
    }

    run {
        println("----25.8----")
        val p1 = Person8("タケシ", 7)
        val p2 = Person8(name = "タケシ", age = 7)
        val p3 = Person8(age = 7, name = "タケシ")
        p1.greet()
        p2.greet()
        p3.greet()
    }

    run {
        println("----25.9----")
        val p1 = Person9("タケシ", 7)
    }
}

class Person2 (val name: String = "", var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

class Person7 (val name: String = "名無しさん", var age: Int = 20) {
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

class Person8 (val name: String, var age: Int) {
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

class Person9 (val name: String, var age: Int) {
    init {
        println("コンストラクタのイニシャライザが呼ばれました。")
        greet()
    }
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}