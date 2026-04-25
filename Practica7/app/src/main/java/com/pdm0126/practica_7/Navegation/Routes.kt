package com.pdm0126.practica_7.Navegation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {
  @Serializable
  data object Home:Routes()
}