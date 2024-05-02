//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//
//
//    val recommendations = recommendItems(userPreferences, items)
//// Print the recommendations
//    println("Recommended items:")
//    for (item in recommendations) {
//        println("${item.name} (${item.category}) - $${item.price}")
//    }
//
//
//
//}
//
//// Define a data class to represent an item
//data class Item(val id: Int, val name: String, val category: String, val price: Double)
//// Define a function to calculate the similarity between two items based on their categories
//fun similarity(item1: Item, item2: Item): Double {
//    if (item1.category == item2.category) {
//        return 1.0
//    } else {
//        return 0.0
//    }
//}
//// Define a function to recommend items based on user preferences
//fun recommendItems(userPreferences: List<Item>, items: List<Item>): List<Item> {
//    val recommendations = mutableListOf<Item>()
//    for (item in items) {
//        var totalSimilarity = 0.0
//        var similarityCount = 0.0
//        for (preference in userPreferences) {
//            totalSimilarity += similarity(item, preference)
//            similarityCount += 1.0
//        }
//        val averageSimilarity = totalSimilarity / similarityCount
//        if (averageSimilarity > 0.5) {
//            recommendations.add(item)
//        }
//    }
//    return recommendations
//}
//// Define some sample data
//val userPreferences = listOf(
//    Item(1, "Shirt", "Clothing", 29.99),
//    Item(2, "Jeans", "Clothing", 39.99),
//    Item(3, "Sneakers", "Footwear", 69.99)
//)
//val items = listOf(
//    Item(4, "T-Shirt", "Clothing", 19.99),
//    Item(5, "Shorts", "Clothing", 24.99),
//    Item(6, "Socks", "Clothing", 9.99),
//    Item(7, "Running Shoes", "Footwear", 79.99),
//    Item(8, "Hiking Boots", "Footwear", 99.99),
//    Item(9, "Backpack", "Accessories", 39.99)
//)
//
// Sample implementation using Kotlin
// Sample implementation using Kotlin
fun main() {

    val store = Store()

    store.addPreferences("Audi")
    store.recommendations("Audi")
}
class Store (){


    var cars = mutableListOf("Toyota","Mitsubishi","Audi","wagon","Isuzu","Marcedes","probox")
    var furnitures = mutableListOf("Seats","beds","Tables", "cooking sticks", "Cudboards")
    var groceries = mutableListOf("tomatoes","spinach","mushroom","brocoli","Onions","Potatoes")


    var userPreferences = mutableListOf<String>()
    fun addPreferences(item:String){
        userPreferences.add(item)
    }
    fun recommendations(item: String){
        if (item in cars){
            println(cars)
        }
        else if (item in furnitures){
            println(furnitures)
        }
        else if (item in groceries){
            println(groceries)
        }
        else{
            println("Item not found")
        }
    }
}