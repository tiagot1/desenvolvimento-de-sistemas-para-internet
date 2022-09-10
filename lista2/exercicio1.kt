fun main(args: Array<String>) {
    var soma = 0
    for (i in 1..500){
        if (i % 3 == 0){
            soma = soma + i
          println(soma)
        }
    }

}
//1) Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
//três e que se encontram no conjunto dos números de 1 até 500.