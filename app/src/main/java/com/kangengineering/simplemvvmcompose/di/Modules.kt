package com.kangengineering.simplemvvmcompose.di

import com.kangengineering.simplemvvmcompose.data.PetsRepository
import com.kangengineering.simplemvvmcompose.data.PetsRepositoryImpl
import com.kangengineering.simplemvvmcompose.viewmodel.PetsViewModel
import org.koin.dsl.module

val appModules = module {
    single<PetsRepository> { PetsRepositoryImpl() }
    single { PetsViewModel(get()) }
}