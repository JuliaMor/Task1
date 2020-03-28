package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val listBill = bill.toMutableList()
        listBill.removeAt(k)
        val sum = b - (listBill.sum() / 2)
        return if (sum == 0) "Bon Appetit" else sum.toString()
    }
}
