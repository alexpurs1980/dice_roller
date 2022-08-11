package com.example.diceroller


import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {

    @Test // тег теста
    fun generates_number () {
        val dice = Dice(6)
        val rollResult = dice.roll()
        // проверка результата в диапазоне, если НЕ ВЫПОЛНИТСЯ - выдаст строку!
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}