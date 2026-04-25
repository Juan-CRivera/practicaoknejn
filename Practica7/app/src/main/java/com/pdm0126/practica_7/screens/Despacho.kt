package com.pdm0126.practica_7.screens

import android.R.attr.navigationIcon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pdm0126.practica_7.Componentes.listaProductos

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Despacho(
    navigateToBack: () -> Unit,
    productoId : Int
){
val productos = listaProductos.find {it.id == productoId}
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = {Text(text="Despacho")},
        navigationIcon = {
            IconButton(onClick = navigateToBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Regresar"
                )
            }
        }
    )
}
) {innerPadding ->
        productos?.let{item ->
Column(
    modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
){
    Image(
        painter = painterResource(id = item.imagenRes),
        contentDescription = item.nombre,
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
Text(text= item.nombre,
    style = MaterialTheme.typography.headlineMedium,
    fontWeight = FontWeight.Bold
)
Text(
    text=item.cantidad,
    style = MaterialTheme.typography.headlineMedium,
    fontWeight = FontWeight.Bold
)
    }
}
        }
    }

}