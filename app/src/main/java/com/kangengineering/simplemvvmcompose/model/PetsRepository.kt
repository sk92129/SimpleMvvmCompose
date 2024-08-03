package com.kangengineering.simplemvvmcompose.model

interface PetsRepository {
    fun getPets(): List<Pet>
}