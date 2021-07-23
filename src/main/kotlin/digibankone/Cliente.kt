package digibankone

class Cliente(
    nome: String,
    cpf: String,
    val ClienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
    Nome: $nome
    Cpf: $cpf
    Tipo: $ClienteTipo
    """.trimIndent()
}