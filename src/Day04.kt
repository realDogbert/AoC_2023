import kotlin.math.pow

fun main() {

    fun part1(input: List <String>):Int {

        return input.map { line:String ->
            val (_, winningNumbersText, ourNumbersText) = line.split(":", "|")
            val winningNumbers = winningNumbersText.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
            val ourNumbers = ourNumbersText.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
            winningNumbers to ourNumbers
        }.map { (winningNumbers, ourNumbers) ->
            val count = winningNumbers.count{ it in ourNumbers}
            if (count != 0) {
                2.0.pow(count-1).toInt()
            } else {
                0
            }
        }.sum()

    }

    val input = readInput("Day04")
    part1(input).println()
}