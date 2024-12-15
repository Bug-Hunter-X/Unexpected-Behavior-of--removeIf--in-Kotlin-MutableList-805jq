fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 2]
    list.add(6)
    list.add(7)
    println(list) // Output: [1, 2, 6, 7]
    val iterator2 = list.iterator()
    while (iterator2.hasNext()) {
        if (iterator2.next() > 2) {
            iterator2.remove()
        }
    }
    println(list)// Output: [1,2]
    list.add(6)
    list.add(7)
    val iterator3 = list.iterator()
    while (iterator3.hasNext()) {
        if (iterator3.next() in 1..5) {
            iterator3.remove()
        }
    }
    println(list) // Output: [6, 7]
}