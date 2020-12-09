package com.example.primeirodesafio

import java.util.*

data class Matricula(val estudante: Estudante, val curso: Curso) {

    var data = Date()
    val dataMatricula: Date = data

}
