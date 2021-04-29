fun main() {
  fun hello(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
  }

  val upper = fun(value: String): String {
    if(value == "") return "UPS"
    return value.toUpperCase()
  }

  println(hello("IdHam", upper))
  println(hello("", upper))
}