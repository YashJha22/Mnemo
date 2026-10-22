package com.mnemo.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.mnemo.app.ui.DeckViewModel
import com.mnemo.app.ui.theme.MnemoTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MnemoTheme {
                val viewModel: DeckViewModel = viewModel()
                Scaffold(modifier = Modifier.fillMaxSize())
                { innerPadding ->
                    Text(
                        text = "Mnemo",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

