import scala.collection.mutable.Map

object worksheet {
    def main(args: Array[String]): Unit = {
        
        val studentMap = Map("Andrew" -> 90, "Genine" -> 90, "Greg" -> 80)
        studentMap("Charles") = 95
        println(studentMap)
        println(studentMap("Andrew"))


        val studentImmutMap = Map("Andrew" -> 90, "Genine" -> 90, "Greg" -> 80)
        val newMap = studentImmutMap + ("Dave" -> 79)
        println(newMap)
        println(newMap("Greg"))

}
}