package com.pdm0126.practica_7.Componentes

import com.pdm0126.practica_7.R

data class productos(
    val id: Int,
    val nombre: String,
    val cantidad: String,
    val imagenRes:Int
)

val listaProductos = listOf(
    productos(
        1,
        "Laptop",
        "10",
        R.drawable.mierda
    ),
    productos(
        2,
        "Mouse",
        "15",
        R.drawable.pupu
    ),
   productos(
       3,
       "Monitor",
       "5",
       R.drawable.davidmierda
   )
)