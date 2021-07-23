package digibankone

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: BigDecimal): funcionario(nome, cpf, salario) {
    override fun calculoauxilio() = salario + 0.1

}
