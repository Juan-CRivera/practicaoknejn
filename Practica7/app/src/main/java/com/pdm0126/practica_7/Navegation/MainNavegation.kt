package com.pdm0126.practica_7.Navegation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.practica_7.screens.Despacho
import com.pdm0126.practica_7.screens.Home

import com.pdm0126.practica_7.screens.Resumen


@Composable
fun MainNavigation() {
    val backStack = rememberNavBackStack()

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                Home(
                    navigateToDespacho = { id ->
                        backStack.add(Routes.Despacho(id))
                    }
                )
            }
            entry<Routes.Despacho> { route ->
                Despacho(
                    productoId = route.id,
                    navigateToBack = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}