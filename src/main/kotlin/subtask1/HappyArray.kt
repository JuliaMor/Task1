package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val mutableList = sadArray.toMutableList()
        for (i in mutableList.size - 2 downTo 1) {
            if (mutableList[i + 1] + mutableList[i - 1] < mutableList[i])
                mutableList.removeAt(i)
        }
        return mutableList.toIntArray()
    }
}
