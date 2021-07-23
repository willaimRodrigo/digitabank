package digibankone.testes

import digibankone.Cliente
import digibankone.ClienteTipo

fun main() {
    val Jose = Cliente(
        nome = "Jose da Silva",
        cpf = "12312312312",
        ClienteTipo = ClienteTipo.PF,
        senha = "123123"

    )
     println(Jose)

    TesteAutenticado().autentica(Jose)
}