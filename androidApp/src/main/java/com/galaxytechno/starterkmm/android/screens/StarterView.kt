package com.galaxytechno.starterkmm.android.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.galaxytechno.starterkmm.Greeting

@Composable
fun StarterView() {

    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onSurface,
                elevation = 1.dp,
                content = {
                    Text(text = "Starter KMM")
                },
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                ),

            )
        },
        floatingActionButton = {

            FloatingActionButton(
                onClick = {

                },
                shape = RoundedCornerShape(16.dp),
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onSurface,
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "next quote"
                )
            }
        },
        content = {
            StarterSuccess(
                description = Greeting().greeting()
            )
        }
    )
}