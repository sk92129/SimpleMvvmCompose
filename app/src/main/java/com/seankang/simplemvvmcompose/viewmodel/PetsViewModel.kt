package com.seankang.simplemvvmcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.seankang.simplemvvmcompose.model.PetsRepository

class PetsViewModel(
    private val petsRepository: PetsRepository
): ViewModel() {

    fun getPets() = petsRepository.getPets()
}