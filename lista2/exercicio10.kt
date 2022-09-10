// Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
//A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
fun main(args: Array<String>) {
    println("Digite o valor de A: ")
    val A:Int = readLine()!!.toInt()
    var fatorial:Int =1
    var i = 0
    while ( A>0){
        fatorial = fatorial * A
        println(fatorial)
        break
    }

}