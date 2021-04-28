fun main() {
//  for array
  val names = arrayOf("Idham", "Nur", "Adzani")
  for(name in names) {
    println(name)
  }

//  for range
  for(value in 0..100){
    println(value)
  }

  for(value in 1000 downTo 0 step 5){
    println(value)
  }

//  for kombinasi array dan length
  val arrSize = names.size-1
  for(i in 0..arrSize){
    println("index $i = ${names.get(i)}")
  }
}