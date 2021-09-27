data class Product(val name: String, val price: Int)
val products = listOf(Product("A", 10), Product("B", 1), Product("C", 1000))

//fun findHeiht(products: List<Product>): Product? {
//    var maxPrice = 0
//    var highestProduct: Product? = null
//
//    for (product in products) {
//        if (product.price > maxPrice) {
//            maxPrice = product.price
//            highestProduct = product
//        }
//    }
//    return highestProduct