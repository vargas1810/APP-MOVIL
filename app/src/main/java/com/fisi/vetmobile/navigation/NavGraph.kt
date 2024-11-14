package com.fisi.vetmobile.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fisi.vetmobile.ui.view.LoginScreen
import com.fisi.vetmobile.ui.view.MascotasScreen
import com.fisi.vetmobile.ui.viewmodel.MainViewModel

@Composable
fun NavGraph(viewModel: MainViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(viewModel) }
        composable("mascotas") { MascotasScreen() }
    }
}
