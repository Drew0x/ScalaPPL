object BookstoreApp {
 def main(args: Array[String]): Unit = {
  // Create a map of book titles to prices
  val books: Map[String, Double] = Map(
    "The Pragmatic Programmer" -> 42.50,
    "Clean Code" -> 35.99,
    "Scala for the Impatient" -> 28.75,
    "Introduction to Algorithms" -> 89.00
  )

  // Filter books that cost more than $30
  val expensiveBooks = books.filter { case (title, price) => price > 30 }

  // Display the filtered books
  println("Books costing more than $30:")
  expensiveBooks.foreach { case (title, price) =>
    println(f"$title: $$${price}%.2f")
  }
}
}