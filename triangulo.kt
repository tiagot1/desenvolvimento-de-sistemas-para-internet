fun main(args: Array<String>) {
    println("Digite o primeiro valor:")
    val a:Double = readLine()!!.toDouble()
    println("Digite o segundo valor:")
    val b:Double = readLine()!!.toDouble()
    println("Digite o terceiro valor:")
    val c:Double = readLine()!!.toDouble()
    val perimetro = a+b+c
    val area = ((a+b) * c)/2.0
    if (a+b > c || a+c > b || b+c > a){
        println("Perimetro:"+ perimetro)
    } else {
        println("Area = $area")
    }

}