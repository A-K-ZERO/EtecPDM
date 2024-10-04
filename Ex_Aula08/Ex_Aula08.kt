import kotlin.time.times

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //conversorTempo()
    //retornaCaracteres()
    //calculoCubo()
    //conversorMilhas()
    //retornaCaracteres2("SESS")
    //calculoCubo2(2)
}

fun conversorTempo()
{
    var ano : Long = 0
    var string : String

    println("Digite uma quantidade de anos:")
    string = readLine().toString()
    ano = string.toLong()

    val meses : Long = ano * 12
    val dias: Long = ano * 365
    val horas : Long = ano * 8760
    val minutos : Long = ano * 525600
    val segundos : Long = ano * 31557600

    println("$ano ano(s) e igual a $meses meses, $dias dias, $horas horas, $minutos minutos e $segundos segundos.")
}

fun retornaCaracteres()
{
    var palavraRecebida : String
    println("digite uma palavra:")
    palavraRecebida = readLine().toString()

    println("a palavra $palavraRecebida possui ${palavraRecebida.length} caracteres.")
}

fun conversorMilhas()
{
    var milhas : Double
    var string : String
    var km : Double
    println("digite uma distancia em milhas:")
    string = readLine().toString()
    milhas = string.toDouble()
    km = milhas * 1.6
    println("$milhas milha(s) equivale(m) a $km kilometro(s).")
}

fun calculoCubo()
{
    var n : Int
    var resultado : Int
    var string : String

    println("digite um numero:")
    string = readLine().toString()
    n = string.toInt()

    resultado = n * n * n

    println("o resultado de $n ao cubo e $resultado.")
}

fun retornaCaracteres2(palavra : String) = println("a palavra $palavra possui ${palavra.length} caracteres")

fun calculoCubo2(n : Int) = println("$n ao cubo e igual a ${n * n * n}")

fun conversorMilhas2(milhas : Float) = println("$milhas milha(s) equivale(m) a ${milhas * 1.6} kilometro(s).")
