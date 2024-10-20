fun main()
{
    //Exercicio A
    val name = "Kotlin"
    println("digite uma palavra:")
    var palavra = readln()

    var contador = palavra.length - 1
    while(contador >= 0)
    {
        print("${palavra[contador]}")
        contador--
    }

    println()

    println("${verificador("SxXoO")}")
}

//Exercicio b

fun verificador(str : String):Boolean
{
    var i = 0
    var contadorO = 0
    var contadorX = 0

    while(true)
    {
        if(str[i] == 'o' || str[i] == 'O')
        {
            contadorO ++
        }
        if(str[i] == 'x' || str[i] == 'X')
        {
            contadorX ++
            println("$contadorX")
        }
        i++
        if(i == str.length)
        {
            if (contadorO == contadorX && contadorO != 0)
            {
                return true
            }
            else
            {
                return false
            }
        }
    }
}
