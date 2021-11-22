
fun insertionSort(array: IntArray): IntArray{
    for(j in 1 until array.size){
        val key = array[j]
        var i=j-1
        while (i>=0 && array[i]>key){
            array[i+1] = array[i]
            i -= 1
        }
        array[i+1]=key
    }
    return array
}