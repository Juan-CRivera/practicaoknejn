package com.pdm0126.practica_7.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.practica_7.Componentes.Item
import com.pdm0126.practica_7.Componentes.listaProductos

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    navigateToDespacho:(Int) -> Unit
){
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text(text= "Buhomierda") }) }
    ){innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(listaProductos){productos ->
                Item(
                   nombre = productos.nombre,
                   cantidad = productos.cantidad,
                   imagenRes = productos.imagenRes,
                    onClick = { navigateToDespacho(productos.id) }
                )
            }
        }
    }

}