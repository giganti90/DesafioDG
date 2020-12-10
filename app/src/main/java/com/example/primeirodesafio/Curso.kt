package com.example.primeirodesafio

class Curso(val nomeDoCurso: String, val codCurso: Int, val maximoAlunos: Int) {

    private var vagas = mutableListOf<Estudante>()

    override fun equals(other: Any?) : Boolean {
        if (other === codCurso) {
            println("O Código $codCurso já pertence a outro Curso")
            return other.equals(codCurso)
        }
        return false
    }

    fun adicionarUmAluno(umAluno: Estudante): Boolean {
        if (vagas.size <= maximoAlunos){
            vagas.add(umAluno)
            return true
        }
        return false
    }

    fun removerUmAluno(umAluno: Estudante) {
        vagas.remove(umAluno)
    }

    // IDE que fez isso aqui
    override fun hashCode(): Int {
        var result = nomeDoCurso.hashCode()
        result = 31 * result + codCurso
        result = 31 * result + maximoAlunos
        result = 31 * result + vagas.hashCode()
        return result
    }
    override fun toString(): String {
        return "Curso $nomeDoCurso, com código do curso '$codCurso' e máximo de $maximoAlunos alunos, "
    }
}



