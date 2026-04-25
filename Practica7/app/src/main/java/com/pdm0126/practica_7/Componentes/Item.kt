package com.pdm0126.practica_7.Componentes

import android.R.attr.fontWeight
import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Item(onClick:() -> Unit,
nombre:String,
cantidad: String,
imagenRes: Int
)
{
        Card(
            modifier = Modifier
            .padding(16.dp)
                .height(130.dp)
                .clickable{ onClick() }
        ){
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ){
            Image(
               painter = painterResource(id = imagenRes),
                contentDescription = nombre,
                modifier = Modifier
                    .width(110.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop
            )
             Column(
                 modifier = Modifier
                     .padding(16.dp)
                     .fillMaxWidth()
             ){
                 Text(text = nombre,
                     style= MaterialTheme.typography.titleMedium,
                     fontWeight = FontWeight.Bold,
                     maxLines = 1
                 )
                 Text(text = cantidad,
                     style= MaterialTheme.typography.titleMedium,
                     fontWeight = FontWeight.Bold,
                     maxLines = 1
                 )

             }
            }

        }
    }
