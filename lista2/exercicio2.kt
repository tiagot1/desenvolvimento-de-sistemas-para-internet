fun main(args: Array<String>) {
    println("Digite suas alturas:")
    val alt1:Double = readLine()!!.toDouble()
    val alt2:Double = readLine()!!.toDouble()
    val alt3:Double = readLine()!!.toDouble()
    val alt4:Double = readLine()!!.toDouble()
    val alt5:Double = readLine()!!.toDouble()
    val alt6:Double = readLine()!!.toDouble()
    val alt7:Double = readLine()!!.toDouble()
    val alt8:Double = readLine()!!.toDouble()
    val alt9:Double = readLine()!!.toDouble()
    val alt10:Double = readLine()!!.toDouble()
    val alt11:Double = readLine()!!.toDouble()
    val alt12:Double = readLine()!!.toDouble()
    val alt13:Double = readLine()!!.toDouble()
    val alt14:Double = readLine()!!.toDouble()
    val alt15:Double = readLine()!!.toDouble()

    val alturaMaior = listOf(alt1, alt2, alt3, alt4, alt5, alt6, alt7, alt8, alt9, alt10, alt11,alt12, alt13, alt14, alt15).max()
    val alturaMenor = listOf(alt1, alt2, alt3, alt4, alt5, alt6, alt7, alt8, alt9, alt10, alt11,alt12, alt13, alt14, alt15).min()
    println("A maior altura é: "+alturaMaior)
    println("A menor altura é: "+alturaMenor)
    println("A soma das duas alturas é: "+alturaMenor+alturaMaior)


}
