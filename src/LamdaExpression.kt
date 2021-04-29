fun toUpper(value: String): String = value.toUpperCase()

fun main() {
  val contohLamda: (String, String) -> String = { firstName: String, lastName: String ->
    val result = "$firstName $lastName"
    result
  }

  val result = contohLamda("Dam", "Jet")
  println(result)

  val sayHello: (String) -> String = {
    "Hello $it"
  }

  println(sayHello("Idham"))

  //  method references
  val lamdaName: (String) -> String = ::toUpper

  val name = lamdaName("Idham Adzani")
  println(name)
}