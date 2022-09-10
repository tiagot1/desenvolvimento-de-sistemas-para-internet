fun main(args: Array<String>) {
    println("O animal é vertebrado ou invertebrado?:")
    val animal:String = readLine()!!.toString().lowercase()
    if(animal == "invertebrado"){
        println("O animal é inseto ou anelideo?:")
        val tipo:String = readLine()!!.toString().lowercase()
        if(tipo == "inseto"){
            println("O animal é hematofago ou herbivoro?:")
            val grupo:String = readLine()!!.toString().lowercase()
            if(grupo == "hematofago"){
                println("O animal é: Pulga" )
            }else if (grupo == "herbivoro"){
                println("O animal é: Largata" )
            }else{
                println("por favor digite o nome correto")
            }
        }else if(tipo == "anelideo"){
            println("O animal é hematofago ou herbivoro?:")
            val grupo:String = readLine()!!.toString().lowercase()
            if(grupo == "hematofago"){
                println("O animal é: Sanguesuga" )
            }else if (grupo == "onivoro"){
                println("O animal é: Minhoca" )
            }else{
                println("por favor digite o nome correto")
            }
        }else{
            println("por favor digite o nome correto")
        }
    }else if(animal == "vertebrado") {
        println("O animal é ave ou mamifero?:")
        val tipo: String = readLine()!!.toString().lowercase()
        if (tipo == "ave") {
            println("O animal é carnivoro ou onivoro?:")
            val grupo: String = readLine()!!.toString().lowercase()
            if (grupo == "carnivoro") {
                println("O animal é: Aguia")
            } else if (grupo == "onivoro") {
                println("O animal é: Pombo")
            } else {
                println("por favor digite o nome correto")
            }
        } else if (tipo == "mamifero") {
            println("O animal é onivoro ou herbivoro?:")
            val grupo: String = readLine()!!.toString().lowercase()
            if (grupo == "onivoro") {
                println("O animal é: Homem")
            } else if (grupo == "herbivoro") {
                println("O animal é: Vaca")
            } else {
                println("por favor digite o nome correto")
            }
        } else {
            println("por favor digite o nome correto")
        }
    }
}