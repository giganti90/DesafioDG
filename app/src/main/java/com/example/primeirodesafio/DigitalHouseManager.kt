package com.example.primeirodesafio

class DigitalHouseManager {
    val listaAlunos = mutableListOf<Estudante>()
    val listaCurso = mutableListOf<Curso>()
    val listaProfessores = mutableListOf<Professor>()
    val listaMatriculas = mutableListOf<Matricula>()

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

    fun checaCodigoAluno(numeroAluno: Int): Boolean {
        for (estudante in listaAlunos)
            if (estudante.numeroAluno == numeroAluno) {
                return true
            }
        return false
    }

    fun checaCodigoCurso(codCurso: Int): Boolean {
        for (curso in listaCurso)
            if (curso.codCurso == codCurso) {
                return true
            }
        return false
    }

    fun checaProf(codProf: Int): Boolean {
        for (professor in listaProfessores)
            if (professor.codProf == codProf) {
                return true
            }
        return false
    }

    //talvez mexer nessa function

    fun temVagaNoCurso(maximoAlunos: Int): Boolean {
        if (vaga != null) {
            if (listaAlunos.size < vaga.maximoAlunos) {
                return true
            }
        }
        return false
    }



// versão inicial da function de matricularAluno, não funcionou porque não consigo passar Estudante (classe) para a var "estudanteEncontrado" (idem para Curso)
//    fun matricularAluno(numeroAluno: Int, codCurso: Int) {
//        var estudanteEncontrado: Estudante? = null
//        var cursoEncontrado: Curso? = null
//        var matricula: Matricula? = null
//
//
//        if (estudanteEncontrado in listaAlunos && estudanteEncontrado != null) {
//            estudanteEncontrado.numeroAluno == numeroAluno
//            estudanteEncontrado = Estudante
//
//            listaAlunos.add(estudanteEncontrado)
//        } else {
//            println("não foi possível matricular o aluno neste curso")
//
//        }
//
//        if (cursoEncontrado in listaCurso && cursoEncontrado != null) {
//            if (cursoEncontrado.codCurso == codCurso) {
//                cursoEncontrado = Curso
//                listaCurso.add(cursoEncontrado)
////                cursoEncontrado.adicionarUmAluno(estudanteEncontrado)
//            }
//        }
//
//        if (estudanteEncontrado != null && cursoEncontrado != null) {
//            val deuCerto = cursoEncontrado.adicionarUmAluno(estudanteEncontrado)
//            if (deuCerto != null) {
//                val matricula = Matricula(estudanteEncontrado, cursoEncontrado)
//                listaMatriculas.add(matricula)
//                println("Aluno $estudanteEncontrado matriculado com sucesso em ${matricula.dataMatricula} no curso ${matricula.curso.nomeDoCurso}")
//            } else {
//                println("Infelizmente não há mais vagas disponíveis neste curso.")
//            }
//        }
//    }
//}

        fun matricularAluno(numeroAluno: Int, codCurso: Int) {

            var alunoEncontrado: Estudante? = null
            var cursoEncontrado: Curso? = null

            for (aluno in listaAlunos) {
                if (aluno.numeroAluno == numeroAluno) {
                    alunoEncontrado = aluno
                }
            }
            for (curso in listaCurso) {
                if (curso.codCurso == codCurso) {
                    cursoEncontrado = curso
                }
            }
            if (alunoEncontrado != null && cursoEncontrado != null) {
                val deuCerto = cursoEncontrado.adicionarUmAluno(alunoEncontrado)
                if (deuCerto != null) {
                    val matricula = Matricula(alunoEncontrado, cursoEncontrado)
                    listaMatriculas.add(matricula)
                    println("Aluno $alunoEncontrado matriculado com sucesso em ${matricula.dataMatricula} no curso ${matricula.curso.nomeDoCurso}")
                } else {
                    println("Infelizmente não há mais vagas disponíveis neste curso.")
                }
            }
        }
    }






// vou deixar esta function comentada pois sei que ela não deu certo :(

//    fun alocarProfessores(codCurso: Int, codProf: Int, codAdjunto: Int) {
//        var vaganocurso: Curso = listaCurso[temVagaNoCurso(codCurso)]
//        var titular: ProfessorTitular = listaProfessores[checaProf(codProf)] as ProfessorTitular
//        var adjunto: ProfessorAdjunto = listaProfessores[checaProf(codProf)] as ProfessorAdjunto
//
//
//        fun acharCurso(codCurso: Int) {
//            if (codCurso in listaCurso) {
//                vaganocurso = temVagaNoCurso(Curso)
//                listaCurso.add(alunoMatriculante!!)
//            }
//        }
//
//
//        fun acharTitular(codProf: Int) {
//            if (codProf in listaProfessores) {
//                titular = checaProf
//                listaProfessores.add(titular)
//            }
//        }
//
//        fun acharAdjunto(codProf: Int) {
//            if (codProf in listaProfessores) {
//                adjunto = checaProf
//                listaProfessores.add(adjunto)
//            }
//        }
//    }



