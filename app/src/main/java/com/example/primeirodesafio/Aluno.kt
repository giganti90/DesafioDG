package com.example.primeirodesafio

data class Estudante(val nome: String, val sobrenome: String, var numeroAluno: Int) {

    fun equals(other: Any?) : Boolean {
        if (other is numeroAluno) {
            println("O Número $numeroAluno já pertence a outro aluno")
        }
        return false
        println("$nome cadastrado com sucesso")
    }
}
