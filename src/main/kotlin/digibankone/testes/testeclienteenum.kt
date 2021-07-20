package digibankone.testes

import digibankone.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name}- ${elemento.descricao}")
    }
}