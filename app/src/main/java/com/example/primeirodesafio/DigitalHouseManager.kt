package com.example.primeirodesafio

class DigitalHouseManager {
    val listaAlunos = mutableListOf<Estudante>()
    val listaCurso = mutableListOf<Curso>()
    val listaProfessores = mutableListOf<Professor>()
    val listaMatriculas = mutableListOf<Matricula>()

    val alunoMatriculante: Estudante? = null
    val cursoMasComMinuscula: Curso? = null
    val vaga: Curso? = null


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


    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codProf: Int,
        quantidadeDeHoras: Int
    ) {
        val novoAdjunto = ProfessorAdjunto(0, nome, sobrenome, codProf, quantidadeDeHoras)
        listaProfessores.add(novoAdjunto)
        println("Professor Adjunto $novoAdjunto criado com sucesso")

    }


    fun registrarProfessorTitular(
        nomeProf: String,
        sobrenomeProf: String,
        codProf: Int,
        quantidadeDeHoras: Int
    ) {
        val novoTitular = Professor(nomeProf, sobrenomeProf, codProf, quantidadeDeHoras)
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

    fun checaCodigoAluno(numeroAluno: Int): Int {
        if (numeroAluno in listaAlunos) {
            return numeroAluno
        }
        return -1
    }

    fun checaCodigoCurso(codCurso: Int): Int {
        if (codCurso in listaAlunos) {
            return codCurso
        }
        return -1
    }


    fun temVagaNoCurso() {
        if (vaga != null) {
            if (listaAlunos.size < vaga.maximoAlunos) {
                return
            }
        }
    }
}
        // ate aqui ok
        // daqui pra baixo só desgraça


//        fun matricularAluno(numeroAluno: Int, codCurso: Int) {
//
//            var aluno = listaAlunos[checaCodigoAluno(numeroAluno)]
//            var curso = listaCurso[checaCodigoCurso(codCurso)]
//
//
//            fun acharCurso(codCurso: Int) {
//                if (codCurso in listaCurso && cursoMasComMinuscula != null) {
//                    curso = cursoMasComMinuscula
//                    listaCurso.add(cursoMasComMinuscula)
//                }
//            }
//
//            fun acharAluno(numeroAluno: Int) {
//                if (numeroAluno in listaAlunos && alunoMatriculante != null) {
//                    aluno = alunoMatriculante
//                    listaAlunos.add(alunoMatriculante!!)
//                }
//            }
//
//            if (aluno != null && curso != null) {
//                curso.adicionarUmAluno(aluno)
//            }
//
//            val matricula = Matricula(aluno, curso)
//            listaMatriculas.add(matricula)
//            println("aluno matriculado com sucesso")
//        }
//    }



//    fun alocarProfessores(codCurso: Int, codProf: Int, codAdjunto: Int) {
//
//        fun acharProf(codProf: Int): Professor {
//            var profCadastrar = Professor(codProf)
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




