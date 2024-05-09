package org.example

fun main(args: Array<String>) {
//    val oringinal: Int = 100 // 8.1
//    val oringinal: Int = 100_000 // 8.2
//    val oringinal: String = "100" // 8.3
    val oringinal: String = "あいうえお" // 8.4

    val a: Byte = oringinal.toByte()
    val b: Short = oringinal.toShort()
    val c: Int = oringinal.toInt()
    val d: Long = oringinal.toLong()
    val e: Float = oringinal.toFloat()
    val f: Double = oringinal.toDouble()
    val g: String = oringinal.toString()
    val h: UByte = oringinal.toUByte()
    val i: UShort = oringinal.toUShort()
    val j: UInt = oringinal.toUInt()
    val k: ULong = oringinal.toULong()

    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
    println("e = $e")
    println("f = $f")
    println("g = $g")
    println("h = $h")
    println("i = $i")
    println("j = $j")
    println("k = $k")
}
