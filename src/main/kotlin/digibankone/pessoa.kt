package digibankone

class Pessoa {
    var nome: String= "willaim"

    var cpf: String= "123.456.789-00"
    private set

    constructor()

    fun pessoaInfo()= "$nome e $cpf"

    }

fun main() {
    val willaim= Pessoa()

    println(willaim.pessoaInfo())

}