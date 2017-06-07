package sontdhust.cointrack.helper

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.NumberFormat

fun Double.toFormatString(pattern: String): String {
    val format = NumberFormat.getInstance() as DecimalFormat
    format.applyPattern(pattern)
    return format.format(this)
}