fun main() {
    fun part1(input: List<String>): Int {
        return input.map { string -> string.filter { it.isDigit() } }.map { it.take(1) + it.takeLast(1) }
            .sumOf { it.toInt() }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("inputs/day_01")
    part1(input).println()
    part2(input).println()
}
