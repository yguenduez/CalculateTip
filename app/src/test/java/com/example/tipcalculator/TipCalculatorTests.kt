package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 20.0
        val tip = 20.0
        val expectedTip = "$4.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tip, roundUp = false)

        assertEquals(expectedTip, actualTip)
    }
}