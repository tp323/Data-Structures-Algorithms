fun main() {
    print("hi")
    val array = intArrayOf(5,2,4,6,1,3)
    printIntArray(insertionsort(array))

}

fun printIntArray(array: IntArray) {
    for(i in array.indices)
        println("indice " + i + ":  " +array[i])
}