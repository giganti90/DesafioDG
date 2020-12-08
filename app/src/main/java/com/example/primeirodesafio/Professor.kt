package com.example.primeirodesafio

open class Professor(val nomeProf: String, val sobrenomeProf: String, val tempoDeCasa: Int, var codProf: Int) {

    override fun equals(other: Any?) : Boolean {
        if (other is Professor) {
            println("O Código $codProf já está atribuído a outro professor :/")
            return other.equals(codProf)
        }
        return false
    }

    // IDE que fez isso aqui
    override fun hashCode(): Int {
        var result = nomeProf.hashCode()
        result = 31 * result + sobrenomeProf.hashCode()
        result = 31 * result + tempoDeCasa
        result = 31 * result + codProf
        return result
    }
}
