package com.example.primeirodesafio

data class DigitalHouseManager {
    val listaAlunos = mutableListOf<Estudante>()
    val listaCurso = mutableListOf<Curso>()
    val listaProfessores = mutableListOf<Professor>()
    val listaMatriculas = mutableListOf<Professor>()



    fun registraCurso(val nomeDoCurso: Curso, val codCurso: Curso, val maximoAlunos: Curso) {
        val novoCurso = Curso
        listaCurso.add(novoCurso)
    }

    fun removerCurso(val codCurso: Int){
        listaCurso.remove(Curso)
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String, codProf: Int, quantidadeDeHoras: Int) {
        val novoAdjunto = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, 0, codProf)
        listaProfessores.add(novoAdjunto)
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codProf: Int, quantidadeDeHoras: Int) {
        val novoTitular = Professor(nome, sobrenome, 0, codProf)
        listaProfessores.add(novoTitular)
    }

    fun excluirProfessor(val codProf: Int){
        listaProfessores.remove(Professor)
    }

    fun registrarAluno(nome: String, sobrenome: String, numeroAluno: Int){
        val novoAluno = Estudante(nome, sobrenome, numeroAluno)
    }




   open fun matricularAluno(numeroAluno: Int, codCurso: Int) {
       var alunoMatriculado = Estudante(numeroAluno)
       var cursoDaMatricula = Curso(codCurso)


       fun acharAluno(numeroAluno: Int): Estudante {

            alunoMatriculado = null
            listaAlunos.forEach { estudante ->
                alunoMatriculado = estudante
            }
            return alunoMatriculado
        }

        fun acharCurso(codCurso: Int): Curso {

            cursoDaMatricula = null
            listaCurso.forEach { curso ->
                cursoDaMatricula = curso
            }
            return cursoDaMatricula
        }

        if (alunoMatriculado != null && cursoDaMatricula != null) {
            cursoDaMatricula.adicionarUmAluno(alunoMatriculado)
            val matricula = Matricula(estudante = Estudante, curso = Curso, dataMatricula)
            matricula.add(listaMatriculas)
            println("matricula realizada com sucesso")
        } else {
            println("não existem mais vagas neste curso")
        }
    }


    fun alocarProfessores(codCurso: Int, codProf: Int, codAdjunto: Int) {

        fun acharProf(codProf: Int): Professor {
            var profCadastrar = Professor(codProf)
            profCadastrar = null
            listaProfessores.forEach { professor ->
                profCadastrar = professor
            }
            return profCadastrar
        }

        fun acharAdjunto(codAdjunto: Int): ProfessorAdjunto {
            var adjuntoCadastrar = ProfessorAdjunto(codAdjunto)
            adjuntoCadastrar = null
            listaProfessores.forEach { adjunto ->
                adjunto = adjunto
            }
            return acharAdjunto
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
