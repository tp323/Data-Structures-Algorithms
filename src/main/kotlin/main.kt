
fun main() {
    val array = intArrayOf(5, 2, 4, 6, 1, 3)
    printIntArray(insertionSort(array))

}

fun printIntArray(array: IntArray) {
    for(i in array.indices)
        println("index " + i + ":  " +array[i])
}