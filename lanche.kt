fun main(args: Array<String>) {
    println("Informe o Id do produto:")
    val id:Int = readLine()!!.toInt()
    println("Informe a quantidade:")
    val quantidade:Int = readLine()!!.toInt()
    if (id == 1) {
        println("O valor total é R$: " + quantidade * 4.0)
    }else if (id == 2) {
        println("O valor total é R$:" + quantidade * 4.5)
    }else if (id == 3) {
        println("O valor total é R$: " + quantidade * 5.0)
    }else if (id == 4) {
        println("O valor total é R$:" + quantidade * 2.0)
    }else if(id == 5){
        println("O valor total é R$:" + quantidade * 1.5)
    }else{
        println("Por favor digite um Id valido")
    }
}