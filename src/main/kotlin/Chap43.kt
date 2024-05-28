package com.example.chap43

fun main() {
    run {
        println("----43.1----")
        val car = Car("赤")
        repeat(51) {
            print("$it:")
            car.drive()
        }
    }

    run {
        println("----43.2----")
        val car = Prius("赤")
        repeat(101) {
            println("$it:")
            car.drive()
        }
    }
}

open class Car(val color: String) {
    protected var fuel = 50.0

    public fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        } else {
            println("ガス欠で、走れません！")
        }
    }

    open protected fun letEngineWork() {
        println("ブルルーン！")
        fuel -= 1.0
    }
}

    class Prius(color: String) : Car(color) {
        override fun letEngineWork() {
            println("スイーン！")
            fuel -= 0.5
        }
    }
