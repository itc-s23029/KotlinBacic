package org.example.chap24

fun main(args: Array<String>) {
    run {
        println("----24.1----")
        val p = Person1()
        p.name = "タケシ"
        p.age = 5
        p.greet()
        val n = p.name
        val a = p.age
        println("変数n の値: $n")
        println("変数a の値: $a")
    }

    run {
        println("----24.3----")
        val p = Person3()
        p.age = 30
        p.age = 25
        p.age = 80
        p.age = 10
    }

    run {
        println("----24.4----")
        val p = Person4()
        p.name = "タケシ"
        p.age = 5
        println(p.message)
        println(p.getGreetMessage())
    }

    run {
        println("----24.5----")
        val p = Person4()
        p.name = "タケシ"
        p.age = 5
        println(p.message)
        p.age = 6
        println(p.message)
        p.age = 100
        println(p.message)
    }
}

class Person1 {
    var name: String = ""
    var age: Int = 0
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

class Person3 {
    var age: Int = 20
        set(value) {
            print("${field}歳から ${value}際になりました。")
            if (value < field) {
                println(" -> なんと！若返りましたよ！")
            } else if (value > field) {
                println(" -> ああ、年を取るのは、いやだな。")
            }
            field = value
        }
}

class Person4 {
    var name: String = ""
    var age: Int = 0
    val message: String
        get() {
            return "${name}です。${age}歳です。"
        }
    fun getGreetMessage(): String {
        return "${name}です。${age}歳です。"
    }
}

class Person7 {
    var name: String = ""
    var age: Int = 0
    val message: String
        get() = "${name}です。${age}歳です。"
}

class Person8 {
    var name: String = ""
    var age: Int = 0
    var textAge: String
        set(value) {
            age = value.toInt()
        }
        get() = age.toString()
}