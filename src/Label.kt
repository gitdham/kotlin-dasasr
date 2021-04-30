fun main() {
  loopi@ for(i in 1..10) {
    loopj@ for(j in 1..10) {
      println("$i x $j = ${i * j}")
    }
  }
}