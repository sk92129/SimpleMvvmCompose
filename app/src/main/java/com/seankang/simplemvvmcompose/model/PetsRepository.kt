package com.seankang.simplemvvmcompose.model

interface PetsRepository {
    fun getPets(): List<Pet>
}