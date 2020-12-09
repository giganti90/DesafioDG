package com.example.primeirodesafio

fun main() {
    val executaManager = DigitalHouseManager()

    executaManager.criaAluno("Gabriel", "Giganti", 1)

    executaManager.registrarProfessorTitular("Jose", "Santos", 10, 20)
    executaManager.registrarProfessorTitular("Talia", "Serra", 12, 15)


    executaManager.registrarProfessorAdjunto("Joao", "Camargo", 11, 10)
    executaManager.registrarProfessorAdjunto("Valeria", "Serra", 13, 5)

    executaManager.registraCurso("Full Stack", 2001, 3)
    executaManager.registraCurso("Android", 2002, 2)


//    executaManager.alocarProfessores(2001, 10, 11)
//    executaManager.alocarProfessores(2002, 12, 13)

    executaManager.matricularAluno(1, 2001)

}
