fun main()
{
    trocaLetras()
}

fun trocaLetras()
{
    var palavra : String
    var posicao : Int = 0
    println("digite uma palavra:")
    palavra = readLine().toString()
    palavra = palavra.uppercase()
    println("${palavra.replace('A', 'X')}")
}
