package com.example.primeirodesafio

data class DigitalHouseManager {
    val listaAlunos = mutableListOf<Estudante>()
    val listaCurso = mutableListOf<Curso>()
    val listaProfessores = mutableListOf<Professor>()
    val listaMatriculas = mutableListOf<Professor>()

    val checaAluno: Estudante? = null
    val checaCurso: Curso? = null


    fun registraCurso(nomeDoCurso: String, codCurso: Int, maximoAlunos: Int) {
        val novoCurso = Curso(nomeDoCurso, codCurso, maximoAlunos)
        listaCurso.add(novoCurso)
    }


    fun removerCurso(codCurso: Int) {
        for (novoCurso: Curso in listaCurso) {
                listaCurso.remove(novoCurso)
            }
        }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codProf: Int, quantidadeDeHoras: Int) {
        val novoAdjunto = ProfessorAdjunto(0, nome, sobrenome, codProf, quantidadeDeHoras)
        listaProfessores.add(novoAdjunto)
    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codProf: Int, quantidadeDeHoras: Int) {
        val novoTitular = Professor(nome, sobrenome, codProf, quantidadeDeHoras)
        listaProfessores.add(novoTitular)
    }


    fun excluirProfessor(codProf: Int) {
        for (novoTitular: Professor in listaProfessores) {
                listaProfessores.remove(novoTitular)
            }
        }


    fun criaAluno(nome: String, sobrenome: String, numeroAluno: Int) {
        val alunoNovo = Estudante(nome, sobrenome, numeroAluno)
        listaAlunos.add(alunoNovo)
    }
        // ate aqui ok



        fun matricularAluno(numeroAluno: Int, codCurso: Int): Estudante {

            var alunoMatriculado: Estudante = listaAlunos(numeroAluno)
            var cursoDaMatricula: Curso = listaCurso(codCurso)


            fun acharCurso(codCurso: Int) {
                if (codCurso in listaCurso) {
                    if (checaCurso != null) {
                        cursoDaMatricula = checaCurso
                    }
                }
            }

            fun acharAluno(alunoNovo: String) {
                if (numeroAluno in listaAlunos) {
                    if (checaAluno != null)
                        alunoMatriculado = checaAluno
                }
            }

            if (listaCurso(codCurso).maximoAlunos) {
                println("não existem mais vagas neste curso")

            } else {
                cursoDaMatricula.adicionarUmAluno(alunoMatriculado)
                val matricula = Matricula(estudante = Estudante, curso = Curso, dataMatricula)
                matricula.add(listaMatriculas)
                println("matricula realizada com sucesso")
            }
        }


    fun alocarProfessores(codCurso: Int, codProf: Int, codAdjunto: Int) {

        fun acharProf(codProf: Int): Professor {
            var profCadastrar = Professor(codProf)
            profCadastrar = null
            listaProfessores.forEach { professor -> profCadastrar = professor
            }
            return profCadastrar
        }

        fun acharAdjunto(codAdjunto: Int): ProfessorAdjunto {
            var adjuntoCadastrar = ProfessorAdjunto(codAdjunto)
            adjuntoCadastrar = null
            listaProfessores.forEach { adjunto -> adjunto = adjunto
            }
            return adjuntoCadastrar
        }
    }
}

//        if (acharProf != null && acharAdjunto != null) {
//            adicionarUmAluno(alunoMatriculado)
//            val matricula = Matricula(estudante = Estudante, curso = Curso, dataMatricula)
//            matricula.add(listaMatriculas)
//            println("matricula realizada com sucesso")
//        } else {
//            println("não existem mais vagas neste curso")
//        }
//    }



