package com.example.onlineshopping.config

import com.example.onlineshopping.feature.LoginRoute.LoginVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginVM() }
}