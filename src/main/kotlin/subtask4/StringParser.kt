package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val builder = StringBuilder(inputString)
        val leftBrackets = listOf('(', '<', '[')
        val rightBrackets = listOf(')', '>', ']')
        val list = ArrayList<String>()
        var last = 0
        for (i in builder.length - 1 downTo 0) {
            if (leftBrackets.contains(builder[i])) {
                for (y in i until builder.length) {
                    if (builder[y] == rightBrackets[leftBrackets.indexOf(inputString[i])]){
                        last = y
                        builder[last] = '_'
                        break
                    }
                }
                list.add(0, inputString.substring(i + 1, last))
            }
        }
        return list.toTypedArray()
    }
}
