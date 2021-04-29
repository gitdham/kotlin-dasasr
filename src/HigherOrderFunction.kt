fun main() {
  fun hello(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
  }

  val lamdaUpper = { value: String -> value.toUpperCase() }
  println(hello("Idam", lamdaUpper))
  println(hello("Adi", { value: String -> value.toLowerCase() }))

  //  trailing lamda agar lebih rapi
  val result = hello("Adzani") { value: String ->
    value.toLowerCase()
  }
}