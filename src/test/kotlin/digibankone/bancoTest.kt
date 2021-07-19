package digibankone

import junit.framework.TestCase

class bancoTest : TestCase(){

    val digiBankOne = banco(nome= "digibamkOne", numero= 12)

    println(digibankOne.nome)
    println(digibankOne.numero)
}