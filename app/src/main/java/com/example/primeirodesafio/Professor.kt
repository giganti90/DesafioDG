package com.example.primeirodesafio

data class Professor(val nomeProf: String,
                val sobrenomeProf: String,
                val tempoDeCasa: Int,
                val codProf: Int) {

    fun equals(other: Any?) : Boolean {
        if (other === codProf) {
            return other.equals(codProf)
            println("O Código $codProf já está atribuído a outro professor :/")
        }
        return false
    }
}
