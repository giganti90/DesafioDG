package com.example.primeirodesafio

data class Curso(val nomeDoCurso: String, val codCurso: Int, val maximoAlunos: Int) {

    var professortitular = Professor
    var vaga = mutableListOf<Estudante>()

    fun equals(other: Any?) : Boolean {
        if (other === codCurso) {
            return other.equals(codCurso)
            println("O Código $codCurso já pertence a outro Curso")
        }
        return false
    }

    fun adicionarUmAluno(umAluno: Estudante): Boolean {
        if (vaga.size <= maximoAlunos){
            vaga.add(Estudante)
            return true
        }
        return false
    }

    fun removerUmAluno(umAluno: Estudante): Boolean {
        vaga.remove(Estudante())
    }

}


