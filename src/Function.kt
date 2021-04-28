fun helloWorld() {
  println("Hello world")
  println("Programmer zaman now")
}

fun sayHello(firstName: String, lastName: String?) {
  if(lastName == null) return println("Hello $firstName")
  println("Hello $firstName $lastName")
}

//default parameter
fun hello(firstName: String, lastName: String? = null) {
  if(lastName == null) return println("Hello $firstName")
  println("hello $firstName $lastName")
}

//single expression
fun double(a: Int): Int = a * 2

fun hi(name: String): Unit = println("Hi $name")

// function varargs
fun finalValue(name: String, vararg values: Int) {
  var total = 0.0
  for(value in values) {
    total += value
  }
  total /= values.size
  println("Final value $name = $total")
}

//extension function
fun String.hello(): String = "Hello $this"

//infix notation
infix fun String.to(type: String): String {
  if(type == "UP") return this.toUpperCase()
  return this.toLowerCase()
}

//  return if
fun sapa(name: String=""):String{
  return if(name == ""){
    "Hello bro"
  } else{
    "Hello $name"
  }
}

//return when
fun sapa2(name: String=""):String{
  return when(name){
    ""->"Hello bro"
    else->"Hello $name"
  }
}

fun main() {
  helloWorld()
  sayHello("Idham", "Adzani")
  sayHello("Idham", null)
  hello("Dam", "Jet")
  hello("Jet")
  val result = double(10)
  println(result)
  hi("Dam")
  finalValue("Adzani", 1, 4, 2, 5, 3, 5, 7, 4, 2, 4, 6)

  val name = "Idham"
  println(name.hello())

  val result2 = "Adzani" to "LOW"
  println(result2)

  println(sapa("Ujang"))
  println(sapa())

  println(sapa2("Rambo"))
  println(sapa2())
}