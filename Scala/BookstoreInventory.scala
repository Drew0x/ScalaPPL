object BookstoreInventory {
  def main(args: Array[String]): Unit = {
    val books: Map[String, Double] = Map("Scala Programming" -> 29.99, "Functional Programming" -> 39.95, "AI Basics" -> 49.99)

    val booksWithNewTitle = books + ("Data Science Handbook" -> 44.99)

    val booksWithUpdatedPrice = booksWithNewTitle.updated("Scala Programming", 34.99)

    val expensiveBooks = booksWithUpdatedPrice.filter(book => book._2 > 30)

    println("Expensive books: " + expensiveBooks)
  }
}