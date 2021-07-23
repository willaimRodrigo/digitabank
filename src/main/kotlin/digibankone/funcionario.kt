package digibankone

import java.math.BigDecimal

abstract class funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
): Pessoa(nome , cpf) {
    protected abstract fun calculoauxilio(): BigDecimal?
} override fun toString(): String= """
    Nome: $nome
    Cpf: $cpf
    Salario: $salario
    Auxilio: $(calculoAuxilio()) 
""".trimIndent()