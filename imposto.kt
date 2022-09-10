fun main(args: Array<String>) {
    println("Digite sua renda:")
    val renda:Double = readLine()!!.toDouble()
    var imposto:Double
    if (renda >= 0 && renda <= 2000.00){
        println("Isento")
    }else if(renda > 2000 && renda <= 3000){
        imposto = (renda - 2000) * 0.08
        println("R$ " + imposto)
    }else if(renda == 3002.00){
        imposto = (renda - 2000) * 0.08
        println("R$ " + imposto)
    }else if(renda > 3000 && renda <= 4500){
        imposto = ((renda - 3000) * 0.18)+80
        println("R$ " + imposto)
    }else if(renda > 4500){
        imposto = ((renda - 3000) * 0.28)+350
        println("R$ " + imposto)
    }
}