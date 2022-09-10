fun main(args: Array<String>) {
    val num1:Int = readLine()!!.toInt()
    for (i in 1..100){
        if(i <= num1){
            if (i % 2 != 0){
                println(i)
            }
        }
    }
}
