package ru.netology

fun main() {

    val likes = 1111

    val people = "людям"
    val human = "человеку"

    val res = if (likes % 100 == 11) {
        people
    } else if (likes == 0
        || likes % 10 == 1
        || likes % 100 == 21
        || likes % 100 == 31
        || likes % 100 == 41
        || likes % 100 == 51
        || likes % 100 == 61
        || likes % 100 == 71
        || likes % 100 == 81
        || likes % 100 == 91) {
        human
    } else {
        people
    }

    println("Понравилось $likes $res")

}

/**
 * 1 (му) человеку
 * 2 (ум) людям
 * 3 (ем) людям
 * 4 (ем) людям
 * 5 (ти) людям
 * 6 (ти) людям
 * 7 (ми) людям
 * 8 (ми) людям
 * 9 (ти) людям
 * 10 (ти) людям
 * 11 (ти) людям
 */

/**
 * 1 % 10 = 1 (человеку)
 * 11 % 10 = 1 (людям)
 * 101 % 100 =
 */