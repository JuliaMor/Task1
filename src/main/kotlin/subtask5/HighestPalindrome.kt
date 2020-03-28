package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        if (n < 1)
            return if (k < 1) digitString else "9"
        if (n == 0)
            return digitString
        val halfSize = digitString.length / 2
        var req = 0
        for (i in 0 until halfSize) {
            if (digitString[i] != digitString[digitString.lastIndex - i])
                req++
        }
        if (req > k)
            return "-1"
        var strg = k - req
        val builder = StringBuilder(digitString)
        for (i in 0 until halfSize) {
            if (builder[i] != builder[builder.lastIndex - i]) {
                if (strg > 0) {
                    builder[i] = '9'
                    builder[builder.lastIndex - i] = '9'
                    --strg
                } else {
                    builder[i] = maxOf(builder[i], builder[builder.lastIndex - i])
                    builder[builder.lastIndex - i] = maxOf(builder[i], builder[builder.lastIndex - i])
                }
            }
        }
        return builder.toString()
    }
}
