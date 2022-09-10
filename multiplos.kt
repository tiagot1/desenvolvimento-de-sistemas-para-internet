{
    println("Digite o primeiro numero:")
    val num1:Int = readLine()!!.toInt()
    println("Digite o segundo número:")
    val num2:Int = readLine()!!.toInt()
    if (num1 % num2 == 0){
        println("São Multiplos")
    } else{
        println("Não são multiplos")
    }
}