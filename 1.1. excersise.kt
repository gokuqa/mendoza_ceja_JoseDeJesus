fun allLongestStrings(inputArray: Array<String>): Array<String> {
    var maxLength = 0
    for (str in inputArray) {
        if (str.length > maxLength) {
            maxLength = str.length
        }
    }
    
    val result = mutableListOf<String>()
    
    for (str in inputArray) {
        if (str.length == maxLength) {
            result.add(str)
        }
    }
    
    return result.toTypedArray()
}

fun main() {
    val inputArray = arrayOf("aba", "aa", "ad", "vcd", "aba")
    val longestStrings = allLongestStrings(inputArray)
    println(longestStrings.joinToString(", ")) // Imprimir el resultado
}
