fun main() {
  val finalExam = 'A'
  when(finalExam) {
    //    'A' -> println("Amazing")
    //    'B' -> println("Good")
    //    'C' -> println("Not Bad")
    //    'D' -> println("Bad")
    //    'E' -> println("Try again next week")
    //    else -> println("Ups")

    'A', 'B', 'C' -> println("Pass")
    else          -> println("Not Pass")
  }

  //  When in
  val passValues = arrayOf('A', 'B', 'C')
  when(finalExam) {
    in passValues  -> println("Pass")
    !in passValues -> println("Try again")
  }

  //  When is
  val name = "Dam"
  when(name) {
    is String  -> println("This is string")
    !is String -> println("This is not string")
  }

  //  When tanpa variable / pengganti if else
  val examValue = 90
  when {
    examValue > 80 -> println("Good job")
    examValue > 60 -> println("Not bad")
    else           -> println("Try again next year")
  }
}