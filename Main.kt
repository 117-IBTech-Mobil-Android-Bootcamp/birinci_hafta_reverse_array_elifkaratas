import java.util.*
/// Elif Karataş
fun main(args: Array<String>) {
    /// Creating array with taking inputs those are elements and size of the array from user
    val sc = Scanner(System.`in`)
    println("Please enter the array size: ")
    var array = IntArray(sc.nextInt())
    val size : Int = array.size
    println("Size of the array: ${size}")
    println("Please enter the numbers: ")
    for(i in array.indices)
        array[i] = sc.nextInt()
    println("Original array:" + Arrays.toString(array))
    /// Creating reverse array with taking input that is start index of the reversing array from user
    println("Please enter the start index of the reverse array: ")
    var index : Int = sc.nextInt()
    println("Reverse array: " + Arrays.toString(array.extensionReverseArray(array,index)))
}
/// Elif Karataş
fun IntArray.extensionReverseArray(array: IntArray, index: Int): IntArray {
    /// Some variables for using in reverse process
    var size : Int = array.size-1 /// End of the original array
    var temp : IntArray = IntArray(size+1) /// Reversed array is the temp array
    var index : Int = index /// index variable for start index
    var tempIndex : Int = index /// temp index variable to reversing the array
    if(index > size){
        /// If start index out of the size of the array, notify the user
        println("Please enter an index smaller than the size of the array!!!")
    }
    /// If start index smaller than size of the array, do for loops
    if (index < size) {
        /// Send values before start index of the original array to temp array
        for (i in 0..index){
            temp[i] = array[i]
        }
        /// Send values from end to start index to temp array
        for (i in size downTo index){
            temp[tempIndex] = array[i]
            tempIndex = tempIndex.plus(1) /// Increase the index
        }
    }
    return temp
}