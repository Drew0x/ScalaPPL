object myName {
  def test(x:Int) : Boolean = 
    {
      Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
    }

  def main(args: Array[String]): Unit = {
    print("Result: " + test(115));
  }
}