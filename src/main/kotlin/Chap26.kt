package com.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    //プライマリコンストラクタのみを使う場合
    // 1.まずはBookがないと始まらない
    val book = Book(
        100,
        "やさしい Kotlin 入門",
        "野崎英一",
        LocalDate.of(2018, 5, 10)
    )

    // 2.貸出情報 Rental
    val rental = Rental(
        book.id,
        "タケシ",
        LocalDateTime.now(),
        LocalDateTime.of(2024,5,28,12, 30)
    )

    // 3.book と rental を合わせた BookWith
    val boolWithRental = BookWithRental(
        book, rental
    )

    // 4.まとめた bookWithRental を使って Book
    val bookInfo = BookInfo(
        boolWithRental.book.id,
        boolWithRental.book.title,
        boolWithRental.book.author,
        boolWithRental.isRental
    )

    // 5.中身を表示
    bookInfo.printInfo()

    // 4.2別パターン
    val boolInfo2 = BookInfo(
        book.id,
        book.title,
        book.author,
        true
    )

    // 4.3 理想的なパターン
    val bookInfo3 = BookInfo(boolWithRental)
}

class BookInfo(
    val id: Long, //Bookクラスのidと同じ
    val title: String, //Bookクラスのtitleと同じ
    val author: String, //Bookクラスのauthorと同じ
    val isRental: Boolean //BookクラスのisRentalと同じ
) {

    constructor(bookWithRental: BookWithRental) : this(
        bookWithRental.book.id,
        bookWithRental.book.title,
        bookWithRental.book.author,
        bookWithRental.isRental
    )
    fun printInfo() {
        println(
            """
                [ID:${id}] $title (${author})
                ${if (isRental) "貸出中です" else "貸出可能です"}
            """.trimIndent()
        )
    }
}

class Book(
    val id: Long,
    val title: String,
    val author: String,
    val releaseDate: LocalDate,
)

class Rental(
    val bookId: Long,
    val userName: String,
    val rentalDateTime: LocalDateTime,
    val returnDeadline: LocalDateTime,
)

class BookWithRental(
    val book: Book,
    val rental: Rental?
) {
    val isRental: Boolean
        get() = rental != null
}
