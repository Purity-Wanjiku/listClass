fun main() {
    val nums = listOf(12,5,76,20,45,12)
    var combine = mutableListOf<Int>()
    for (y in nums){
        if (y%2 == 0){
//            combine+=y  //my work
            combine.add(y)  //Snaida's work
        }
//        println(combine)
        println(combine)
    }
//in a more civil way
val evenNums = nums.filter { y -> y%5==0 }
    println(evenNums)


    val fruits = listOf("banana", "apple", "mango", "avocado")
    println(fruits)

    val kenya = mutableListOf(1250000, "Alfayo", true, 20.6, 34.5f)
//    fruits.add("watermelon")

    kenya.add("Constitutional Monarchy")
    println(kenya)
    kenya.remove(34.5f)
    println(kenya)

    var numbers = listOf(32,77,21,34,56,1)
    var sum = 0
    for (n in numbers)
    {
        sum += n
    }
    println(sum)

    adds(listOf(20,30,40))
//    println(numbers.count())
//    println(numbers.max())
//    println(numbers.min())
//    println(numbers.sum())
//    println(numbers.lastIndex)
//    println(numbers.lastIndexOf(77))

    val number = mutableListOf(32, 77, 21, 34, 56, 1)
//    number.sort()                   //it sorts the list in ascending order automatically
    val numSorted = number.sorted()  //sorted returns a copy of the list unless you introduce a variable
    println(numSorted)

    createProductList()
}
//list has pointers thus it can value in size. One can add or remove elements. Can be mutable or immutable
//the array can only take its position. It is immutable

//write a function that sums up all the elements in a list without using the method .sum()
fun adds (elements: List<Int>){
    var sum = 0
    for (a in elements){
        sum += a
    }
    println(sum)
}

data class Product(var name: String, var price: Double)
fun createProductList(){
    val prod1 = Product("iPhone", 120000.00)
    val prod2 = Product ("switch",350.00)
    val prod3 = Product("Mango",550.00)

    val products = listOf<Product>(prod1,prod2,prod3)
    println(products)


    val sorted = products.sortedByDescending { x -> x.price }  //sorts the price in the list in descending order (large to small)
    println(sorted)

    val filterBalance = products.filter { r -> r.price <= 5000 }
    println(filterBalance)
}