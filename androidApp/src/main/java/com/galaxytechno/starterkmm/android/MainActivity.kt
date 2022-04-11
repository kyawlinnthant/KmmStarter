package com.galaxytechno.starterkmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.galaxytechno.starterkmm.android.screens.StarterView
import com.galaxytechno.starterkmm.android.theme.StarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StarterTheme {
                Surface {
                    StarterView()
                }
            }
        }
    }
}
