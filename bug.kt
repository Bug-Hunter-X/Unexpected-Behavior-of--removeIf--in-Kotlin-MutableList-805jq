fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]
    list.add(6)
    list.add(7)
    println(list)// Output: [1, 2, 6, 7]
    list.removeIf { it > 2 }
    println(list)// Output: [1,2]
    list.add(6)
    list.add(7)
    list.removeIf { it in 1..5 }
    println(list) // Output: [6,7]
}