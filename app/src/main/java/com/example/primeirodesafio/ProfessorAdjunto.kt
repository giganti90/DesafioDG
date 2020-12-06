package com.example.primeirodesafio

data class ProfessorAdjunto(val horasMonitoria: Int, nome: String, sobrenome: String, tempoDeCasa: Int, codAdjunto: Int):
    Professor( nome, sobrenome, tempoDeCasa, codProf) {
}
