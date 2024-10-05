 fun main()
 {
     var n1: Int
     var n2: Int
     println("Digite dois numeros")
     val str1 = readln()
     val str2 = readln()
     n1 = str1.toInt()
     n2 = str2.toInt()
     if(n1 + n2 == 3)
     {
         println("A figura é um triângulo")
     }
     else if(n1 + n2 == 4)
     {
         println("A figura é um quadrado")
     }
     else
     {
         println("A figura não é um triangulo nem um quadrado")
     }
     medidorLados()
 }

 fun medidorLados()
 {
     var n1:Int
     var n2:Int
     var n3:Int

     println("Digite as medidas dos lados do triângulo:")
     var str1 = readln()
     var str2 = readln()
     var str3 = readln()

     n1 = str1.toInt()
     n2 = str2.toInt()
     n3 = str3.toInt()

    if(n1 == n2 && n1 == n3)
    {
        println("O triângulo é equilátero.")
    }
     else if(n1 == n2 || n1 == n3 || n2 == n3)
    {
         println("O triângulo é isóceles.")
    }
     else
    {
        println("O triângulo é escaleno.")
    }
 }