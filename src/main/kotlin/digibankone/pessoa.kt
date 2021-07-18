package digibankone

class Pessoa {
    var nome: String= "willaim"

    var cpf: String= "123.456.789-00"
    private set

    }

fun main() {
    val willaim= Pessoa()

    println(willaim.nome)
    println(willaim.cpf)

}