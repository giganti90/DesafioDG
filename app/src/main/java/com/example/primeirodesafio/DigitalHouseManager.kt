package com.example.primeirodesafio

class DigitalHouseManager {
    val listaAlunos = mutableListOf<Estudante>()
    val listaCurso = mutableListOf<Curso>()
    val listaProfessores = mutableListOf<Professor>()
    val listaMatriculas = mutableListOf<Professor>()

    val alunoMatriculante: Estudante? = null
    val cursoMasComMinuscula: Curso? = null


    fun registraCurso(nomeDoCurso: String, codCurso: Int, maximoAlunos: Int) {
        val novoCurso = Curso(nomeDoCurso, codCurso, maximoAlunos)
        listaCurso.add(novoCurso)
        println("$novoCurso criado com sucesso")
    }


    fun removerCurso(codCurso: Int) {
        for (novoCurso: Curso in listaCurso) {
            listaCurso.remove(novoCurso)
            println("Curso $novoCurso removido com sucesso")

        }
    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codProf: Int, quantidadeDeHoras: Int) {
        val novoAdjunto = ProfessorAdjunto(0, nome, sobrenome, codProf, quantidadeDeHoras)
        listaProfessores.add(novoAdjunto)
        println("Professor Adjunto $novoAdjunto criado com sucesso")

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codProf: Int, quantidadeDeHoras: Int) {
        val novoTitular = Professor(nome, sobrenome, codProf, quantidadeDeHoras)
        listaProfessores.add(novoTitular)
        println("Professor Titular $novoTitular criado com sucesso")


    }


    fun excluirProfessor(codProf: Int) {
        for (novoTitular: Professor in listaProfessores) {
            listaProfessores.remove(novoTitular)
            println("Professor Titular $novoTitular removido com sucesso")

        }
    }


    fun criaAluno(nome: String, sobrenome: String, numeroAluno: Int) {
        val alunoNovo = Estudante(nome, sobrenome, numeroAluno)
        listaAlunos.add(alunoNovo)
        println("Aluno $alunoNovo criado com sucesso")

    }
}


        // ate aqui ok
    // daqui pra baixo só desgraça



//        fun matricularAluno(numeroAluno: Int, codCurso: Int): Estudante {
//
//            var novoAlunoMatriculado = Estudante(numeroAluno)
//            var novoCursoCriado = Curso(codCurso)
//
//
//            fun acharCurso(codCurso: Int) {
//                if (codCurso in listaCurso) {
//                    if (cursoMasComMinuscula != null) {
//                        novoCursoCriado = cursoMasComMinuscula
//                    }
//                }
//            }
//
//            fun acharAluno(alunoNovo: String) {
//                if (numeroAluno in listaAlunos) {
//                    if (alunoMatriculante != null)
//                        novoAlunoMatriculado = alunoMatriculante
//                }
//            }
//
//            if (codCurso in listaCurso && maximoAlunos) {
//                println("não existem mais vagas neste curso")
//            } else {
//                novoCursoCriado.adicionarUmAluno(novoAlunoMatriculado)
//                val matricula = Matricula(estudante = Estudante, curso = Curso, dataMatricula)
//                matricula.add(listaMatriculas)
//                println("matricula realizada com sucesso")
//            }
//        }
//
//
//    fun alocarProfessores(codCurso: Int, codProf: Int, codAdjunto: Int) {
//
//        fun acharProf(codProf: Int): Professor {
//            var profCadastrar = Professor(codProf)
//            profCadastrar = null
//            listaProfessores.forEach { professor -> profCadastrar = professor
//            }
//            return profCadastrar
//        }
//
//        fun acharAdjunto(codAdjunto: Int): ProfessorAdjunto {
//            var adjuntoCadastrar = ProfessorAdjunto(codAdjunto)
//            adjuntoCadastrar = null
//            listaProfessores.forEach { adjunto -> adjunto = adjunto
//            }
//            return adjuntoCadastrar
//        }
//    }
//}
//
//
//
//
