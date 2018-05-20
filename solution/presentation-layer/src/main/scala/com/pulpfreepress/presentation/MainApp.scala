import com.pulpfreepress.infrastructure.utils._

object MainApp {
  def main(args: Array[String]) = {
    println("Hello World!")
    val sparkBase = new SparkBase("local", "TestApp")
    val lines = sparkBase.sc.textFile("plato.txt")
    val count = lines.count()
    println("Lines in Plato's Republic: " + count)

    val words = lines.flatMap(line => line.split(" "))
    println("Words in Plato's Republic: " + words.count())

    val uniqueWords = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    println("UNIQUE words in Plato's Republic:" + uniqueWords.count())
    
    println("--------------------------------------------------------")

    val signaler = new Signaler()
    signaler.signal("Signal sent from MainApp class!")

  }
}
