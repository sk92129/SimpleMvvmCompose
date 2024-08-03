package com.seankang.simplemvvmcompose.di

import com.seankang.simplemvvmcompose.model.PetsRepository
import com.seankang.simplemvvmcompose.model.PetsRepositoryImpl
import com.seankang.simplemvvmcompose.viewmodel.PetsViewModel
import org.koin.dsl.module

val appModules = module {
    single<PetsRepository> { PetsRepositoryImpl() }
    single { PetsViewModel(get()) }
}