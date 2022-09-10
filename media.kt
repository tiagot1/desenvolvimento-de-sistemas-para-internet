fun main(args: Array<String>){
    println("Digite sua  primeira nota:")
    var nota1:Double = readLine()!!.toDouble()
    print("Digite sua  segunda nota:")
    var nota2:Double = readLine()!!.toDouble()
    print("Digite sua  terça nota:")
    var nota3:Double = readLine()!!.toDouble()
    print("Digite sua  quarta nota:")
    var nota4:Double = readLine()!!.toDouble()
    var media: Double = ((2 * nota1) + (3 * nota2) + (4 * nota3) + (1 * nota4)) / 2.0

    if(media >=7){
        println("Media: "+media+" aluno aprovado")
    }else if(media <5){
        println("Aluno reprovado")
    }else{
        println("Aluno em exame")
        println("Digite a nota do exame")
    }
    var notaExame:Double = readLine()!!.toDouble()
    println("Nota exame:"+notaExame)
    var notaFinal = (media + notaExame)
    if(notaFinal<5){
        println("Media final: "+ notaFinal)
        println("Aluno Reprovado")
    }else{
        println("Media final: "+ notaFinal)
        println("Aluno aprovado")
    }

}