fun main(args: Array<String>) {
    println("Digite a coordenada do primeiro ponto:")
    val coord1:Double = readLine()!!.toDouble()
    println("Digite a coordenada do primeiro ponto:")
    val coord2:Double = readLine()!!.toDouble()
    if (coord1 == 0.0 && coord2 == 0.0){
        println("Origem.")
    }else if(coord1 == 0.0){
        println("Eixo X.")
    }else if(coord2 == 0.0){
        println("Eixo Y.")
    }else if(coord1 > 0.0 && coord2 >0.0){
        println("Se encontra no ponto 1")
    }else if(coord1 < 0.0 && coord2 > 0.0){
        println("Se encontra no ponto 2")
    }else if(coord1 < 0.0 && coord2 < 0.0){
        println("Se encontra no ponto 3")
    }else{
        println("Se encontra no ponto 4")
    }
}
