package io.github.firzaelbuho.hlsmui.di

import io.github.firzaelbuho.hlsmui.screen.generate.GenerateViewModel
import io.github.firzaelbuho.hlsmui.screen.generate.scheme.SchemeViewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

val appModule = module {
    single { GenerateViewModel() }
    single { SchemeViewModel() }
}

fun initKoin() = startKoin {modules(appModule)}
