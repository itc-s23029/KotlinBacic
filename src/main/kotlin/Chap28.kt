package com.example.chap28

import com.example.chap27.Car5

fun main(args: Array<String>) {
    run {
        println("----28.4----")
        val car = Ferrari("赤")
        car.drive(100.0)
    }

    run {
        println("----28.6----")
        val car = Prius("グレー")
        car.drive(500.0)
    }
}

// 28.2
class Ferrari(color: String) : Car5(color){
    // 28.3
    override fun drive(d: Double) {
        distane = distane + d
        println("${color}のフェラーリが走っています！ブウォォォォォーン！")
        println("おおっ、かっこいい！！！")
        println("マイレージは ${distane}キロになったぜい！")
    }
}

// 28.5
class Prius(color: String) : Car5(color){
    override fun drive(d: Double) {
        distane = distane + d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${distane}キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}