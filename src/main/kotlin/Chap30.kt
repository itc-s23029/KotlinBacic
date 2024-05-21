package com.example.chap30


fun main(args: Array<String>) {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    val car3 = Xbee("水色")
    car1.drive(10.0)
    car2.drive(10.0)
    car3.drive(10.0)
}

abstract class Car(val color: String) {
    var direction = 0.0
    abstract fun drive(d: Double)
}

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        direction += d
        println("${color}のフェラーリが走っています！ブオォォォォォーン！")
        println("おおっ、かっこいい！！！")
        println("マイレージは ${direction}キロになったぜい！")
    }
}

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        direction += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${direction}キロです。トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}

class Xbee(color: String) : Car(color) {
    override fun drive(d: Double) {
        direction += d
        println("${color}のクロスビーが走りました")
        println("マイレージは ${direction}キロになりました。")
    }

}