package com.example.chap29


fun main(args: Array<String>) {
    run {
        println("----29.1----")
        val car1 = Ferrari("赤")
        val car2 = Prius("グレー")
    }

    run {
        println("----29.5----")
        val car1 = Ferrari("赤")
        val car2 = Prius("グレー")
        driveByCar(car1)
        driveByCar(car2)
    }
}

// 29.5
fun driveByCar(car: Car) {
    car.drive(100.0)
}

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}の車が ${d}km 走りました。")
        println("その結果、マイレージは ${distance}キロになりました。")
    }
}

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています！ブオォォォォォーン！")
        println("おおっ、かっこいい！！！")
        println("マイレージは ${distance}キロになったぜい！")
    }
}

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${distance}キロです。トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}

fun driveByFerrari(car: Ferrari) {
    car.drive(100.0)
}

fun driveByPrius(car: Prius) {
    car.drive(100.0)
}
