package com.example.chap27

import java.awt.Color

fun main(args: Array<String>) {
    run {
        println("----27.2----")
        val car = Car()
        car.drive(5.0)
        car.drive(10.0)
    }

    run {
        println("----27.4----")
        val car = Ferrari()
        car.drive(5.0)
        car.drive(10.0)
    }

    run {
        println("----27.5----")
        val car = Ferrari5("red")
        car.drive(5.0)
        car.drive(10.0)
    }
}

open class Car() { //27.1
        var distane = 0.0
        open fun drive(d: Double) {
            distane = distane + d
            println("車が ${d}km 走りました。")
            println("マイレージは ${distane}キロになりました。")
        }
    }

open class Car5(val color: String) { //27.1
    var distane = 0.0
    open fun drive(d: Double) {
        distane = distane + d
        println("${color}の車が ${d}km 走りました。")
        println("マイレージは ${distane}キロになりました。")
    }
}

class Ferrari() : Car()
class Ferrari5(color: String) : Car5(color)