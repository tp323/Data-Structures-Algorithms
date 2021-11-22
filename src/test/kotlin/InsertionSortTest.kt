import org.junit.Test
import kotlin.test.assertEquals


internal class InsertionSortTest{
    @Test
    fun emptyArray(){
        assertEquals(0, insertionSort(IntArray(0)).size)
    }

    @Test
    fun sortedArray(){
        val array = intArrayOf(1,2,3,4,5)
        assertEquals(array.size, insertionSort(array).size)
        for(n in array.indices){
            assertEquals(array[n], insertionSort(array)[n])
        }

    }
    @Test
    fun unsortedArray(){
        val array = intArrayOf(8,5,2,6,1,7,4,0,3)
        val sortedArray = intArrayOf(0,1,2,3,4,5,6,7,8)
        assertEquals(array.size, insertionSort(array).size)
        for(n in array.indices){
            assertEquals(sortedArray[n], insertionSort(array)[n])
        }
    }
    @Test
    fun unsortedArrayWithRepeatedElements(){
        val array = intArrayOf(5,5,2,6,1,3,4,0,3)
        val sortedArray = intArrayOf(0,1,2,3,3,4,5,5,6)
        assertEquals(array.size, insertionSort(array).size)
        for(n in array.indices){
            assertEquals(sortedArray[n], insertionSort(array)[n])
        }
    }
}