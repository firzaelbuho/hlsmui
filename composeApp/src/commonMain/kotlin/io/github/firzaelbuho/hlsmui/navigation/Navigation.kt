package io.github.firzaelbuho.hlsmui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.firzaelbuho.hlsmui.screen.MyApp
import io.github.firzaelbuho.hlsmui.screen.generate.GenerateScreen
import io.github.firzaelbuho.hlsmui.screen.home.HomeScreen

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.Generate.route) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Generate.route) {
            GenerateScreen()
        }
        composable(Screen.Test.route)  {
            MyApp()
        }
    }
}