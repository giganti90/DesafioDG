package com.example.primeirodesafio

data class Estudante(val nome: String, val sobrenome: String, var numeroAluno: Int) {

    var matriculaAluno = Int

    override fun equals(other: Any?) : Boolean {
        if (other is Estudante) {
            println("O Número $numeroAluno já pertence a outro aluno")
        }
        println("$nome cadastrado com sucesso")
        return false
    }

    // IDE que fez isso aqui
    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + sobrenome.hashCode()
        result = 31 * result + numeroAluno
        result = 31 * result + matriculaAluno.hashCode()
        return result
    }
}
