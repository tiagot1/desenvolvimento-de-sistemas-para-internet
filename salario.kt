fun main(args: Array<String>) {
    println("Digite seu salario:")
    val salario:Double = readLine()!!.toDouble()
    var reajuste:Double
    if (salario >= 0 && salario <= 400.00){
        var reajuste = salario * 0.15;
        var novoSalario = salario + reajuste
        var percent = 15
        println("Seu novo salario: " + novoSalario)
        println("O valor do reajuste é de " + reajuste)
        println("O percentual do reajuste é de "+ percent)
    } else if(salario > 400.00 && salario <= 800.00){
        var reajuste = salario * 0.12;
        var novoSalario = salario + reajuste
        var percent = 15
        println("Seu novo salario: " + novoSalario)
        println("O valor do reajuste é de " + reajuste)
        println("O percentual do reajuste é de "+ percent)
    } else if(salario > 800.00 && salario <= 1200.00){
        var reajuste = salario * 0.10;
        var novoSalario = salario + reajuste
        var percent = 15
        println("Seu novo salario: " + novoSalario)
        println("O valor do reajuste é de " + reajuste)
        println("O percentual do reajuste é de "+ percent)
    } else if(salario > 1200.00 && salario <= 2000.00){
        var reajuste = salario * 0.7;
        var novoSalario = salario + reajuste
        var percent = 15
        println("Seu novo salario: " + novoSalario)
        println("O valor do reajuste é de " + reajuste)
        println("O percentual do reajuste é de "+ percent)
    }else{
        var reajuste = salario * 0.4;
        var novoSalario = salario + reajuste
        var percent = 15
        println("Seu novo salario: " + novoSalario)
        println("O valor do reajuste é de " + reajuste)
        println("O percentual do reajuste é de "+ percent)
    }

}